package com.cg.pojo;

import com.cg.customer.pojo.BankAccount;
import com.cg.customer.pojo.Customer;
import com.cg.customer.pojo.SavingsAccount;

public class MMBankSavingsAccount extends SavingsAccount {
BankAccount account;
	public MMBankSavingsAccount(Customer accountHolder, boolean salary,String accountType) {
	super(accountHolder, salary, accountType);
	}
	
	public MMBankSavingsAccount(Customer accountHolder, double accountBalance, boolean salary,String accountType) {
		super(accountHolder, accountBalance, salary,accountType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  double withdraw(double amountToBeWithDrawn)
	{
		if(amountToBeWithDrawn<account.getAccountBalance())
		{
			double balance=this.getAccountBalance()-amountToBeWithDrawn;
	this.setAccountBalance(balance);
		return amountToBeWithDrawn;
		}
		else
			return 0;

	}


}
