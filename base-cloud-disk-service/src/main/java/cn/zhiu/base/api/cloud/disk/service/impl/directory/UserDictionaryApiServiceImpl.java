package cn.zhiu.base.api.cloud.disk.service.impl.directory;

import cn.zhiu.base.api.cloud.disk.bean.directory.UserDirectory;
import cn.zhiu.base.api.cloud.disk.service.directory.UserDirectoryApiService;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import cn.zhiu.framework.base.api.core.service.impl.AbstractBaseApiServiceImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 14:08
 * @Description:
 */
@Transactional
@Service("userDictionaryApiServiceImpl")
public class UserDictionaryApiServiceImpl extends AbstractBaseApiServiceImpl implements UserDirectoryApiService {


    @Override
    public UserDirectory get(Long id) {
        return null;
    }

    @Override
    public UserDirectory save(UserDirectory model) {
        return null;
    }

    @Override
    public boolean del(Long id) {
        return false;
    }

    @Override
    public boolean deleteBatch(List<Long> id) {
        return false;
    }

    @Override
    public List<UserDirectory> findAll(ApiRequest apiRequest) {
        return null;
    }

    @Override
    public ApiResponse<UserDirectory> findAll(ApiRequestBody requestBody) {
        return null;
    }

    @Override
    public List<UserDirectory> findAll() {
        return null;
    }

    @Override
    public void updateBatch(List<UserDirectory> models) {

    }

    @Override
    public UserDirectory update(UserDirectory models) {
        return null;
    }
}
