package com.xiao.springbootstart.controller;/*
 * @Title: HelloWorldController
 * @Package: com.xiao.springbootstart.controller
 * @Description:
 * @author: xiaoyh
 * @date: 2019/5/25 16:19
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */

import com.xiao.springbootstart.component.NeoProperties;
import com.xiao.springbootstart.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName : HelloWorldController
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/5/25 16:19
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/
@RestController
public class HelloWorldController {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    private NeoProperties neoProperties;

    @RequestMapping("/hello")
    public String index() {
        logger.info("hello...");
        return "中国";
    }

    @RequestMapping("/getUser")
    public User getUser() {
        logger.info("getUser...");
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }

    @RequestMapping("/getProperty")
    public String getProperty() {
        logger.info("getProperty...");
        return neoProperties.getTitle() + "  " + neoProperties.getDescription();
    }


    @RequestMapping("/test")
    public void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("test......");
        PrintWriter out = null;
        out = response.getWriter();
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
        out.write("");
        out.flush();
        out.close();
    }


    @RequestMapping("/test1")
    public String test1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("test1......");
        try {

            if(true){
                throw new RuntimeException("RuntimeException");
            }

        }catch (Exception e){
            logger.info("catch .....");
            throw new Exception("exception");
        }
        return "success";

    }

}