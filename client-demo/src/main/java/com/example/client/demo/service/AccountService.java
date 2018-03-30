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
package com.example.client.demo.service;

import com.example.client.demo.dao.AccountMapper;
import com.example.client.demo.mapper.TEasConfigMapper;
import com.example.client.demo.vo.AccountVO;
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
    private AccountMapper accountMapper;

    @Autowired
    private TEasConfigMapper easConfigMapper;

    public int add(String name, Double money) {
        return accountMapper.add(name, money);
    }

    public int update(String name, Double money, Long id) {
        return accountMapper.update(name, money, id);
    }

    public int delete(Long id) {
        return accountMapper.delete(id);
    }

    public AccountVO findAccount(Long id) {
        return accountMapper.findAccount(id);
    }

    public List<AccountVO> findAccountList() {
        easConfigMapper.selectAll();
        return accountMapper.findAccountList();
    }
}
