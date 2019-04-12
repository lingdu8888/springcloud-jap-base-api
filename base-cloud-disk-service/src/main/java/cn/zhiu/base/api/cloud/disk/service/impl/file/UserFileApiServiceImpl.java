package cn.zhiu.base.api.cloud.disk.service.impl.file;

import cn.zhiu.base.api.cloud.disk.bean.file.UserFile;
import cn.zhiu.base.api.cloud.disk.service.file.UserFileApiService;
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
@Service("userFileApiServiceImpl")
public class UserFileApiServiceImpl extends AbstractBaseApiServiceImpl implements UserFileApiService {

    @Override
    public UserFile get(String id) {
        return null;
    }

    @Override
    public UserFile save(UserFile model) {
        return null;
    }

    @Override
    public boolean del(String id) {
        return false;
    }

    @Override
    public boolean deleteBatch(List<Long> id) {
        return false;
    }

    @Override
    public List<UserFile> findAll(ApiRequest apiRequest) {
        return null;
    }

    @Override
    public ApiResponse<UserFile> findAll(ApiRequestBody requestBody) {
        return null;
    }

    @Override
    public List<UserFile> findAll() {
        return null;
    }

    @Override
    public void updateBatch(List<UserFile> models) {

    }

    @Override
    public UserFile update(UserFile models) {
        return null;
    }
}
