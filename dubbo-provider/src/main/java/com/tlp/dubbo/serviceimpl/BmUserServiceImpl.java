package com.tlp.dubbo.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tlp.dubboapi.dto.BmUser;
import com.tlp.dubboapi.service.BmUserService;
import org.springframework.stereotype.Component;

/**
 * @author：tlp
 * @crateDate：2019/9/15 19:01
 */
@Component
@Service(version = "1.0.0",timeout = 10000 ,interfaceClass =BmUserService.class )
public class BmUserServiceImpl implements BmUserService {
    @Override
    public BmUser getBmUsers() {
        BmUser bmUser = new BmUser();
        bmUser.setId("1");
        bmUser.setAge("18");
        bmUser.setName("大帅比");
        return bmUser;
    }
}
