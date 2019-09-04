package com.xiao.springbootstart.dao;

import com.xiao.springbootstart.pojo.User;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/*
 * @Title: UserRepositoryTest
 * @Package: com.xiao.springbootstart.dao
 * @Description:
 * @author: xiaoyh
 * @date: 2019/5/25 17:00
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
//        userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
//        userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
//        userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));
        Assert.assertEquals(3, userRepository.findAll().size());
        Assert.assertEquals("bb2", userRepository.findByUserNameOrEmail("bb", "bb@126.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa"));
    }

}