package cn.zhiu.base.api.cloud.disk.dao.file;

import cn.zhiu.bean.cloud.disk.entity.file.UserFileEntity;
import cn.zhiu.framework.bean.core.dao.BaseDao;

import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 14:03
 * @Description:
 */
public interface UserFileDao extends BaseDao<UserFileEntity, Long> {
    void deleteAllByIdIn(List<Long> ids);
}
