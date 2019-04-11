package cn.zhiu.base.api.user.controller;

import cn.zhiu.base.api.user.bean.user.UserInfo;
import cn.zhiu.base.api.user.service.user.UserInfoApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserInfoController  {

    @Autowired
    private UserInfoApiService userInfoApiService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    protected UserInfo get(@PathVariable("id") String id) {
        return userInfoApiService.get(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    protected UserInfo save(@RequestBody UserInfo model) {
        return userInfoApiService.save(model);
    }

}
