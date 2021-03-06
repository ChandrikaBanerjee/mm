package com.cg.bank.dao;



import java.util.HashSet;
import java.util.Set;

import com.cg.customer.pojo.BankAccount;


/**
 * @author Satyen Singh
 *
 *This is class for maintianing the list of all unique account objects.
 *
 *This was created from the warm heart. The Developers are From Capgemini.
 */
public  class OnlineBankDao {
	
	private static Set<BankAccount> listOfAccountHolders;
	
	static {
		listOfAccountHolders = new HashSet<>();
	}
	
	/**
	 * @param bankAccount
	 * 
	 * This method takes account object and adds it in the database
	 */
	public static void addBankAccount(BankAccount bankAccount) {
		listOfAccountHolders.add(bankAccount);
	}
	
	/**
	 * @return Set of Accounts
	 * 
	 * This method is responsible for returning all the active accounts
	 */
	public static Set<BankAccount> viewAll(){
		return listOfAccountHolders;
	}
}
