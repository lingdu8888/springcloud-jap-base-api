package cn.zhiu.base.api.cloud.disk.service.impl.operation;

import cn.zhiu.base.api.cloud.disk.bean.operation.UserOperation;
import cn.zhiu.base.api.cloud.disk.dao.directory.UserDirectoryDao;
import cn.zhiu.base.api.cloud.disk.dao.operation.UserOperationDao;
import cn.zhiu.base.api.cloud.disk.service.operation.UserOperationApiService;
import cn.zhiu.bean.cloud.disk.entity.operation.UserOperationEntity;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import cn.zhiu.framework.base.api.core.service.impl.AbstractBaseApiServiceImpl;
import cn.zhiu.framework.base.api.core.util.BeanMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 14:09
 * @Description:
 */
@Transactional
@Service("userOperationApiServiceImpl")
public class UserOperationApiServiceImpl extends AbstractBaseApiServiceImpl implements UserOperationApiService {

    @Autowired
    UserOperationDao userOperationDao;

    @Override
    public UserOperation get(Long id) {
        return BeanMapping.map(userOperationDao.getOne(id), UserOperation.class);
    }

    @Override
    public UserOperation save(UserOperation model) {
        UserOperationEntity entity = BeanMapping.map(model, UserOperationEntity.class);
        entity = userOperationDao.save(entity);
        return BeanMapping.map(entity, UserOperation.class);
    }

    @Override
    public boolean del(Long id) {
        userOperationDao.deleteById(id);
        return true;
    }

    @Override
    public List<UserOperation> findAll(ApiRequest apiRequest) {
        List<UserOperation> resultList = new ArrayList<>();
        List<UserOperationEntity> result = userOperationDao.findAll(convertSpecification(apiRequest));
        BeanMapping.map(result, resultList, UserOperation.class);
        return resultList;
    }

    @Override
    public ApiResponse<UserOperation> findAll(ApiRequestBody requestBody) {
        Page<UserOperationEntity> page = userOperationDao.findAll(convertSpecification(requestBody.getRequest()), convertPageable(requestBody.getRequestPage()));
        return convertApiResponse(page, UserOperation.class);
    }

    @Override
    public List<UserOperation> findAll() {
        List<UserOperation> resultList = new ArrayList<>();
        List<UserOperationEntity> result = userOperationDao.findAll();
        BeanMapping.map(result, resultList, UserOperation.class);
        return resultList;
    }
}
