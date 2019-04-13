package cn.zhiu.base.api.cloud.disk.service.impl.directory;

import cn.zhiu.base.api.cloud.disk.bean.directory.UserDirectory;
import cn.zhiu.base.api.cloud.disk.dao.directory.UserDirectoryDao;
import cn.zhiu.base.api.cloud.disk.service.directory.UserDirectoryApiService;
import cn.zhiu.bean.cloud.disk.entity.directory.UserDirectoryEntity;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import cn.zhiu.framework.base.api.core.service.impl.AbstractBaseApiServiceImpl;
import cn.zhiu.framework.base.api.core.util.BeanMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 14:08
 * @Description:
 */
@Transactional
@Service("userDictionaryApiServiceImpl")
public class UserDictionaryApiServiceImpl extends AbstractBaseApiServiceImpl implements UserDirectoryApiService {

    @Autowired
    UserDirectoryDao userDirectoryDao;


    @Override
    public UserDirectory get(Long id) {
        return BeanMapping.map(userDirectoryDao.getOne(id), UserDirectory.class);
    }

    @Override
    public UserDirectory save(UserDirectory model) {
        UserDirectoryEntity entity = BeanMapping.map(model, UserDirectoryEntity.class);
        entity = userDirectoryDao.save(entity);
        return BeanMapping.map(entity, UserDirectory.class);
    }

    @Override
    public boolean del(Long id) {
        userDirectoryDao.deleteById(id);
        return true;
    }

    @Override
    public boolean deleteBatch(List<Long> id) {
        userDirectoryDao.deleteAllByIdIn(id);
        return true;
    }

    @Override
    public List<UserDirectory> findAll(ApiRequest apiRequest) {
        List<UserDirectory> resultList = new ArrayList<>();

        List<UserDirectoryEntity> result = userDirectoryDao.findAll(convertSpecification(apiRequest));
        BeanMapping.map(result, resultList, UserDirectory.class);
        return resultList;
    }

    @Override
    public ApiResponse<UserDirectory> findAll(ApiRequestBody requestBody) {
        Page<UserDirectoryEntity> page = userDirectoryDao.findAll(convertSpecification(requestBody.getRequest()), convertPageable(requestBody.getRequestPage()));
        return convertApiResponse(page, UserDirectory.class);
    }

    @Override
    public List<UserDirectory> findAll() {
        List<UserDirectory> resultList = new ArrayList<>();
        List<UserDirectoryEntity> result = userDirectoryDao.findAll();
        BeanMapping.map(result, resultList, UserDirectory.class);
        return resultList;
    }

    @Override
    public List<UserDirectory> updateBatch(List<UserDirectory> models) {
        List<UserDirectoryEntity> entities = new ArrayList<>();
        BeanMapping.map(models, entities, UserDirectoryEntity.class);
        entities = userDirectoryDao.saveAll(entities);
        return BeanMapping.mapList(entities, UserDirectory.class);
    }

    @Override
    public UserDirectory update(UserDirectory model) {
        UserDirectoryEntity entity = BeanMapping.map(model, UserDirectoryEntity.class);
        entity = userDirectoryDao.save(entity);
        return BeanMapping.map(entity, UserDirectory.class);
    }

    @Override
    public UserDirectory findOne(ApiRequest apiRequest) {
        List<UserDirectoryEntity> result = userDirectoryDao.findAll(convertSpecification(apiRequest));
        if (!CollectionUtils.isEmpty(result)) {
            return BeanMapping.map(result.get(0), UserDirectory.class);
        }
        return null;
    }
}
