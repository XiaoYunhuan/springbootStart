package com.xiao.springbootstart.component;/*
 * @Title: NeoProperties
 * @Package: com.xiao.springbootstart.component
 * @Description:
 * @author: xiaoyh
 * @date: 2019/5/25 16:43
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName : NeoProperties
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/5/25 16:43
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/
@Component
public class NeoProperties {
    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}