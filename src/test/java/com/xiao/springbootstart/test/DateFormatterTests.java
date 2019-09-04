package com.xiao.springbootstart.test;/*
 * @Title: DateFormatterTests
 * @Package: com.xiao.springbootstart.test
 * @Description:
 * @author: xiaoyh
 * @date: 2019/7/19 11:45
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.format.datetime.DateFormatter;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import static org.junit.Assert.assertThat;


/**
 * @ClassName : DateFormatterTests
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/7/19 11:45
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/
//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DateFormatterTests {
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");

    @Test
    public void shouldPrintAndParseDefault() throws Exception {
        DateFormatter formatter = new DateFormatter();
        formatter.setTimeZone(UTC);
//        Date date = getDate(2009, Calendar.JUNE, 1);
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, 2009);
        instance.set(Calendar.MONTH, 5);
        instance.set(Calendar.DAY_OF_MONTH, 1);
        instance.set(Calendar.HOUR_OF_DAY, 8);
        instance.set(Calendar.MINUTE, 0);
        instance.set(Calendar.SECOND, 0);
        instance.set(Calendar.MILLISECOND,0);
        Date date = instance.getTime();
        assertThat(formatter.print(date, Locale.US), Matchers.is("Jun 1, 2009"));
        assertThat(formatter.parse("Jun 1, 2009", Locale.US), Matchers.is(date));

    }
}
