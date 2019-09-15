package com.tlp.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tlp.dubboapi.dto.BmUser;
import com.tlp.dubboapi.service.BmUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：tlp
 * @crateDate：2019/9/15 19:07
 */
@RestController
public class Controller {
    @Reference(version = "1.0.0")
    private BmUserService bmUserService;

    @RequestMapping("/test1")
    public String getUser() {
        BmUser bmUsers = bmUserService.getBmUsers();
        return bmUsers.toString();
    }

}
