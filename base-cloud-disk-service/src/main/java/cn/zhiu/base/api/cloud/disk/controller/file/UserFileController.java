package cn.zhiu.base.api.cloud.disk.controller.file;

import cn.zhiu.base.api.cloud.disk.bean.file.UserFile;
import cn.zhiu.base.api.cloud.disk.service.file.UserFileApiService;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-12 16:44
 * @Description:
 */
@RestController
@RequestMapping
public class UserFileController {


    @Autowired
    UserFileApiService userFileApiService;
    @RequestMapping(value = "/file/{id}", method = RequestMethod.GET)
    public UserFile get(@PathVariable("id") Long id){
        return userFileApiService.get(id);
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public UserFile save(@RequestBody UserFile model){
        return userFileApiService.save(model);
    }

    @RequestMapping(value = "/file", method = RequestMethod.DELETE)
    public boolean del(@RequestParam("id") Long id){
        return userFileApiService.del(id);
    }

    @RequestMapping(value = "/file/deleteBatch", method = RequestMethod.POST)
    public boolean deleteBatch(@RequestBody List<Long> id){
        return userFileApiService.deleteBatch(id);
    }

    @RequestMapping(value = "/file/list", method = RequestMethod.POST)
    public List<UserFile> findAll(@RequestBody ApiRequest apiRequest){
        return userFileApiService.findAll(apiRequest);
    }

    @RequestMapping(value = "/file/list/page", method = RequestMethod.POST)
    public ApiResponse<UserFile> findAll(@RequestBody ApiRequestBody requestBody){
        return userFileApiService.findAll(requestBody);
    }

    @RequestMapping(value = "/file/all", method = RequestMethod.GET)
    public List<UserFile> findAll(){
        return userFileApiService.findAll();
    }

    @RequestMapping(value = "/file/batch", method = RequestMethod.PUT)
    public List<UserFile> updateBatch(@RequestBody List<UserFile> models){
        return userFileApiService.updateBatch(models);
    }

    @RequestMapping(value = "/file", method = RequestMethod.PUT)
    public UserFile update(@RequestBody UserFile model){
        return userFileApiService.update(model);
    }

    @RequestMapping(value = "/file/findone", method = RequestMethod.POST)
    UserFile findOne(@RequestBody ApiRequest apiRequest){
        return userFileApiService.findOne(apiRequest);
    }
}
