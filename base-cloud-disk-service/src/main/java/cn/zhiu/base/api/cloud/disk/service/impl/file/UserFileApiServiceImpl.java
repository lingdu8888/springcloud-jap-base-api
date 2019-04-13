package cn.zhiu.base.api.cloud.disk.service.impl.file;

import cn.zhiu.base.api.cloud.disk.bean.file.UserFile;
import cn.zhiu.base.api.cloud.disk.dao.file.UserFileDao;
import cn.zhiu.base.api.cloud.disk.service.file.UserFileApiService;
import cn.zhiu.bean.cloud.disk.entity.file.UserFileEntity;
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
@Service("userFileApiServiceImpl")
public class UserFileApiServiceImpl extends AbstractBaseApiServiceImpl implements UserFileApiService {

    @Autowired
    UserFileDao userFileDao;


    @Override
    public UserFile get(Long id) {
        return BeanMapping.map(userFileDao.getOne(id), UserFile.class);
    }

    @Override
    public UserFile save(UserFile model) {
        UserFileEntity entity = BeanMapping.map(model, UserFileEntity.class);
        entity = userFileDao.save(entity);
        return BeanMapping.map(entity, UserFile.class);
    }

    @Override
    public boolean del(Long id) {
        userFileDao.deleteById(id);
        return true;
    }

    @Override
    public boolean deleteBatch(List<Long> id) {
        userFileDao.deleteAllByIdIn(id);
        return true;
    }

    @Override
    public List<UserFile> findAll(ApiRequest apiRequest) {
        List<UserFile> resultList = new ArrayList<>();

        List<UserFileEntity> result = userFileDao.findAll(convertSpecification(apiRequest));
        BeanMapping.map(result, resultList, UserFile.class);
        return resultList;
    }

    @Override
    public ApiResponse<UserFile> findAll(ApiRequestBody requestBody) {
        Page<UserFileEntity> page = userFileDao.findAll(convertSpecification(requestBody.getRequest()), convertPageable(requestBody.getRequestPage()));
        return convertApiResponse(page, UserFile.class);
    }

    @Override
    public List<UserFile> findAll() {
        List<UserFile> resultList = new ArrayList<>();
        List<UserFileEntity> result = userFileDao.findAll();
        BeanMapping.map(result, resultList, UserFile.class);
        return resultList;
    }

    @Override
    public List<UserFile> updateBatch(List<UserFile> models) {
        List<UserFileEntity> entities = BeanMapping.mapList(models, UserFileEntity.class);
        entities = userFileDao.saveAll(entities);
        return BeanMapping.mapList(entities, UserFile.class);
    }

    @Override
    public UserFile update(UserFile model) {
        UserFileEntity entity = BeanMapping.map(model, UserFileEntity.class);
        entity = userFileDao.save(entity);
        return BeanMapping.map(entity, UserFile.class);
    }

    @Override
    public UserFile findOne(ApiRequest apiRequest) {
        List<UserFileEntity> result = userFileDao.findAll(convertSpecification(apiRequest));
        if (!CollectionUtils.isEmpty(result)) {
            return BeanMapping.map(result.get(0), UserFile.class);
        }
        return null;
    }
}
