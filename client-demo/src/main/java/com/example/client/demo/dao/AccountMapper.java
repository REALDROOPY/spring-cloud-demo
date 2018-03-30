/*
 * Copyright (C), 2013-2018, 上汽集团
 * FileName: AccountMapper.java
 * Author:   jiangkun
 * Date:     2018/3/30 10:14
 * Description:
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.example.client.demo.dao;

import com.example.client.demo.vo.AccountVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author jiangkun
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Mapper
public interface AccountMapper {

    @Insert("insert into t_account_test (name, money) values(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") Double money);

    @Update("update t_account_test set name = #{name}, money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") Double money, @Param("id") Long id);

    @Delete("delete from t_account_test where id = #{id}")
    int delete(Long id);

    @Select("select id, name as name, money as money from t_account_test where id = #{id}")
    AccountVO findAccount(@Param("id") Long id);

    @Select("select id, name as name, money as money from t_account_test")
    List<AccountVO> findAccountList();
}
