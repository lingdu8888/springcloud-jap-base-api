package cn.zhiu.base.api.user.dao;

import cn.zhiu.bean.user.entity.user.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface User info dao.
 *
 * @author zhuzz
 * @time 2019 /04/10 14:39:29
 */
public interface UserInfoDao extends JpaRepository<UserInfoEntity, Long> {


}
