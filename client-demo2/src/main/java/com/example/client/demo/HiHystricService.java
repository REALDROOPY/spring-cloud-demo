/*
 * Copyright (C), 2013-2018, 上汽集团
 * FileName: HiHystricService.java
 * Author:   jiangkun
 * Date:     2018/3/29 12:48
 * Description:
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.example.client.demo;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author jiangkun
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Component
public class HiHystricService  implements HelloWorldService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry! " + name;
    }
}
