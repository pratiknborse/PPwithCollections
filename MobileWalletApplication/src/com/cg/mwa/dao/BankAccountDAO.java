package com.cg.mwa.dao;

import com.cg.mwa.dto.Customer;
import com.cg.mwa.exception.BankAccountException;

public interface BankAccountDAO {

	public void createAccount(Customer customer);
	
	public void deposit(String mobileNo, double amount);
	
	public void withdraw(String mobileNo, double amount);
	
	public double checkBalance(String mobileNo);
	
	public void fundTransfer(String sender, String reciever, double amount);
	
	public boolean validateAccount(String mobileNo) throws BankAccountException;
	
}