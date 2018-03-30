/*
 * Copyright (C), 2013-2018, 上汽集团
 * FileName: AccountService.java
 * Author:   jiangkun
 * Date:     2018/3/30 10:16
 * Description:
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.example.freemarker.demo.service;

import com.example.freemarker.demo.entity.TAccountTest;
import com.example.freemarker.demo.mapper.TAccountTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author jiangkun
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AccountService {

    @Autowired
    private TAccountTestMapper accountMapper;

    public TAccountTest selectByPrimaryKey(Long id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    public List<TAccountTest> selectAll() {
        return accountMapper.selectAll();
    }
}
