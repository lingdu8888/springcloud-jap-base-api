package cn.zhiu.base.api.user.service.impl.user;

import cn.zhiu.base.api.user.bean.user.UserInfo;
import cn.zhiu.base.api.user.bean.user.UserInfoResponse;
import cn.zhiu.base.api.user.dao.user.UserInfoDao;
import cn.zhiu.base.api.user.service.user.UserInfoApiService;
import cn.zhiu.bean.user.entity.user.UserInfoEntity;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import cn.zhiu.framework.base.api.core.service.impl.AbstractBaseApiServiceImpl;
import cn.zhiu.framework.base.api.core.util.BeanMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("userInfoApiService")
public class UserInfoApiServiceImpl extends AbstractBaseApiServiceImpl implements UserInfoApiService {

    @Autowired
    protected UserInfoDao userInfoDao;

    @Override
    public UserInfo get(String userId) {
        return BeanMapping.map(userInfoDao.getOne(userId), UserInfo.class);
    }

    @Override
    public UserInfoResponse getUserInfo(String userId) {

        return BeanMapping.map(userInfoDao.getOne(userId), UserInfoResponse.class);
    }

    @Override
    public UserInfo save(UserInfo model) {

        UserInfoEntity entity = BeanMapping.map(model, UserInfoEntity.class);
        entity = userInfoDao.save(entity);
        return BeanMapping.map(entity, UserInfo.class);
    }

    @Override
    public boolean del(String userId) {
        userInfoDao.deleteById(userId);
        return true;
    }

    @Override
    public UserInfo findOne(ApiRequest apiRequest) {
        List<UserInfoEntity> result = userInfoDao.findAll(convertSpecification(apiRequest));
        if (!CollectionUtils.isEmpty(result)) {
            return BeanMapping.map(result.get(0), UserInfo.class);
        }
        return null;
    }

    @Override
    public List<UserInfoResponse> findAll(ApiRequest apiRequest) {
        List<UserInfoResponse> resultList = new ArrayList<>();

        List<UserInfoEntity> result = userInfoDao.findAll(convertSpecification(apiRequest));
        BeanMapping.map(result, resultList, UserInfoResponse.class);

        return resultList;
    }

    @Override
    public ApiResponse<UserInfoResponse> findAll(ApiRequestBody requestBody) {

        Page<UserInfoEntity> page = userInfoDao.findAll(convertSpecification(requestBody.getRequest()), convertPageable(requestBody.getRequestPage()));

        return convertApiResponse(page, UserInfoResponse.class);
    }

    @Override
    public List<UserInfoResponse> findAll() {
        List<UserInfoResponse> resultList = new ArrayList<>();
        List<UserInfoEntity> result = userInfoDao.findAll();
        BeanMapping.map(result, resultList, UserInfoResponse.class);
        return resultList;
    }
}


