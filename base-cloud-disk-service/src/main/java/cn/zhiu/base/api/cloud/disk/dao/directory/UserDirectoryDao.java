package cn.zhiu.base.api.cloud.disk.dao.directory;

import cn.zhiu.bean.cloud.disk.entity.directory.UserDirectoryEntity;
import cn.zhiu.bean.cloud.disk.entity.file.UserFileEntity;
import cn.zhiu.framework.bean.core.dao.BaseDao;

import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 14:02
 * @Description:
 */
public interface UserDirectoryDao extends BaseDao<UserDirectoryEntity, Long> {
    void deleteAllByIdIn(List<Long> ids);
}
