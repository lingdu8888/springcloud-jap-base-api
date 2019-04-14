package cn.zhiu.base.api.cloud.disk.service.file;

import cn.zhiu.base.api.cloud.disk.bean.file.UserFile;
import cn.zhiu.framework.base.api.core.annotation.request.FeignRequestApiProxy;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 12:16
 * @Description:
 */
@FeignRequestApiProxy
@FeignClient(value = "service-cloud-disk")
public interface UserFileApiService {

    @RequestMapping(value = "/file/{id}", method = RequestMethod.GET)
    UserFile get(@PathVariable("id") Long id);

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    UserFile save(@RequestBody UserFile model);

    @RequestMapping(value = "/file", method = RequestMethod.DELETE)
    boolean del(@RequestParam("id") Long id);

    @RequestMapping(value = "/file/deleteBatch", method = RequestMethod.POST)
    boolean deleteBatch(@RequestBody List<Long> id);

    @RequestMapping(value = "/file/list", method = RequestMethod.POST)
    List<UserFile> findAll(@RequestBody ApiRequest apiRequest);

    @RequestMapping(value = "/file/list/page", method = RequestMethod.POST)
    ApiResponse<UserFile> findAll(@RequestBody ApiRequestBody requestBody);

    @RequestMapping(value = "/file/all", method = RequestMethod.GET)
    List<UserFile> findAll();

    @RequestMapping(value = "/file/batch", method = RequestMethod.PUT)
    List<UserFile> updateBatch(@RequestBody List<UserFile> models);

    @RequestMapping(value = "/file", method = RequestMethod.PUT)
    UserFile update(@RequestBody UserFile model);

    @RequestMapping(value = "/file/findone", method = RequestMethod.POST)
    UserFile findOne(@RequestBody ApiRequest apiRequest);
}
