package com.lm.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lm.dao.AccountDao;
import com.lm.service.AccountService;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String fromusername, String tousername, Integer money) {
		accountDao.In(tousername, money);

//		 int i = 1/0;

		accountDao.Out(fromusername, money);
	}

}
