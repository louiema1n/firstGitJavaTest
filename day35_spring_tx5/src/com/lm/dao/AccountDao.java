package com.lm.dao;

public interface AccountDao {
	public void In(String username, Integer money);
	public void Out(String username, Integer money);
}
