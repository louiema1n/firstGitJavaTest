package com.lm.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lm.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void In(String username, Integer money) {
		this.getJdbcTemplate().update("update account set money = money + ? where username = ?", money,username);
	}

	@Override
	public void Out(String username, Integer money) {
		this.getJdbcTemplate().update("update account set money = money - ? where username = ?", money,username);
	}

}
