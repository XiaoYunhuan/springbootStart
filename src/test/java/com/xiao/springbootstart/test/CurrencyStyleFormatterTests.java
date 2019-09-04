package com.xiao.springbootstart.test;/*
 * @Title: CurrencyStyleFormatterTests
 * @Package: com.xiao.springbootstart.test
 * @Description:
 * @author: xiaoyh
 * @date: 2019/7/19 11:42
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */

import org.junit.Test;
import org.springframework.format.number.CurrencyStyleFormatter;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName : CurrencyStyleFormatterTests
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/7/19 11:42
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/
public class CurrencyStyleFormatterTests {
    private final CurrencyStyleFormatter formatter = new CurrencyStyleFormatter();
    @Test
    public void formatValue() {
        assertEquals("$23.00", formatter.print(new BigDecimal("23"), Locale.US));
    }

    @Test
    public void parseValue() throws ParseException {
        assertEquals(new BigDecimal("23.56"), formatter.parse("$23.56", Locale.US));
    }
}
