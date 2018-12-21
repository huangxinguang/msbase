package com.starlight.ms.datasite.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xghuang
 * @date 2018/12/18
 * @time 11:38
 * @desc: 调用用户授权服务接口
 */
@FeignClient("auth-center")
public interface UserService {

    @RequestMapping(method = RequestMethod.POST, value = "/user/login")
    String login(String username,String password);

}
