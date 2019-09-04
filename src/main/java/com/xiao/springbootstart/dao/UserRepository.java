package com.xiao.springbootstart.dao;/*
 * @Title: UserRepository
 * @Package: com.xiao.springbootstart.dao
 * @Description:
 * @author: xiaoyh
 * @date: 2019/5/25 16:59
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */

import com.xiao.springbootstart.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName : UserRepository
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/5/25 16:59
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}
