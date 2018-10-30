package com.cg.mwa.service;

import com.cg.mwa.dto.Customer;
import com.cg.mwa.exception.BankAccountException;

public interface BankAccountService {

	public void createAccount(Customer customer);
	
	public void deposit(String mobileNo, double amount);
	
	public void withdraw(String mobileNo, double amount);
	
	public double checkBalance(String mobileNo);
	
	public void fundTransfer(String sender, String reciever, double amount);
	
	
	public boolean validateAccount(String mobileNo) throws BankAccountException;
	
	public boolean validateName(String name) throws BankAccountException;
	
	public boolean validateAge(float age) throws BankAccountException;
	
	public boolean validateMobileNo(String mobileNo) throws BankAccountException;
	
	public boolean validateAmount(double amount) throws BankAccountException;
			
}
