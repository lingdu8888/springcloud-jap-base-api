package cn.zhiu.base.api.user.service.impl.userlog;

import cn.zhiu.base.api.user.bean.userlog.UserLog;
import cn.zhiu.base.api.user.dao.userlog.UserLogDao;
import cn.zhiu.base.api.user.service.userlog.UserLogApiService;
import cn.zhiu.bean.user.entity.userlog.UserLogEntity;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestPage;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import cn.zhiu.framework.base.api.core.service.impl.AbstractBaseApiServiceImpl;
import cn.zhiu.framework.base.api.core.util.BeanMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("userLogApiService")
public  class UserLogApiServiceImpl extends AbstractBaseApiServiceImpl implements UserLogApiService {

    @Autowired
    protected UserLogDao userLogDao;

    @Override
    public UserLog get(String logId) {
        return BeanMapping.map(userLogDao.getOne(logId), UserLog.class);
    }
    @Override
    public String save(UserLog model) {

        UserLogEntity entity = BeanMapping.map(model, UserLogEntity.class);

        userLogDao.save(entity);

        return entity.getLogId();
    }

    @Override
    public boolean del(String logId) {

        userLogDao.deleteById(logId);
        return true;
    }

    @Override
    public boolean exists(String logId) {
        return userLogDao.existsById(logId);
    }

    @Override
    public List<UserLog> findAll() {

        List<UserLog> resultList = new ArrayList<>();

        List<UserLogEntity> all = userLogDao.findAll();
        BeanMapping.map(all, resultList, UserLog.class);

        return resultList;
    }

    @Override
    public List<UserLog> findAll(ApiRequest apiRequest) {


        List<UserLog> resultList = new ArrayList<>();

        List<UserLogEntity> result = userLogDao.findAll(convertSpecification(apiRequest));
        BeanMapping.map(result, resultList, UserLog.class);
        
        return resultList;
    }

    @Override
    public ApiResponse<UserLog> findAll(ApiRequest apiRequest, ApiRequestPage apiRequestPage) {

        Page<UserLogEntity> page = userLogDao.findAll(convertSpecification(apiRequest), convertPageable(apiRequestPage));

        return convertApiResponse(page, UserLog.class);
    }

    @Override
    public List<UserLog> findAndSortAll(ApiRequest apiRequest, ApiRequestPage apiRequestPage) {

        List<UserLog> resultList = new ArrayList<>();

        List<UserLogEntity> result = userLogDao.findAll(convertSpecification(apiRequest), convertSort(apiRequestPage));

        BeanMapping.map(result, resultList, UserLog.class);

        return resultList;
    }
    

}


