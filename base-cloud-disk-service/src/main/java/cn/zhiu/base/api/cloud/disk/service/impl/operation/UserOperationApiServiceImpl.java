package cn.zhiu.base.api.cloud.disk.service.impl.operation;

import cn.zhiu.base.api.cloud.disk.bean.operation.UserOperation;
import cn.zhiu.base.api.cloud.disk.service.operation.UserOperationApiService;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import cn.zhiu.framework.base.api.core.service.impl.AbstractBaseApiServiceImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 14:09
 * @Description:
 */
@Transactional
@Service("userOperationApiServiceImpl")
public class UserOperationApiServiceImpl extends AbstractBaseApiServiceImpl implements UserOperationApiService {

    @Override
    public UserOperation get(String id) {
        return null;
    }

    @Override
    public UserOperation save(UserOperation model) {
        return null;
    }

    @Override
    public boolean del(String id) {
        return false;
    }

    @Override
    public List<UserOperation> findAll(ApiRequest apiRequest) {
        return null;
    }

    @Override
    public ApiResponse<UserOperation> findAll(ApiRequestBody requestBody) {
        return null;
    }

    @Override
    public List<UserOperation> findAll() {
        return null;
    }
}
