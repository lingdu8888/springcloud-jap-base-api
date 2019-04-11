package cn.zhiu.base.api.user.controller;


import cn.zhiu.base.api.user.dao.user.UserInfoDao;
import cn.zhiu.bean.user.entity.enums.user.SexType;
import cn.zhiu.bean.user.entity.enums.user.UserStatus;
import cn.zhiu.bean.user.entity.user.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.sql.DataSource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    String port;
    @Value("${redis.password}")
    String redisPass;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void init() {
        UserInfoEntity entity = new UserInfoEntity();
        entity.setStatus(UserStatus.DELETE);
        entity.setAccount("abc");
        entity.setEmail("@@");
        entity.setNickName("ddd");
        entity.setPassword("fd");
        entity.setPhone("fasd");
        entity.setRealName("fsd");
        entity.setSex(SexType.Female);
        entity.setSource("fsd");
//        userInfoDao.save(entity);
        System.out.println("123123");
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {

        return "hi " + name + ",i am from port:" + port;
    }

}
