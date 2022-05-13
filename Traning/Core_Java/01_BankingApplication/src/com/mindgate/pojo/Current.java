package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double initialOverDraftBalance;

	public Current() {
		System.out.println("Default Constructor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialOverDraftBalance=overdraftBalance;
		System.out.println("Overloaded Constructor of Current");
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
			if (amount <= getBalance() + overdraftBalance) {
				amount = amount - getBalance();
				setBalance(00);
				overdraftBalance = overdraftBalance - amount;
				return true;
			}

		}
		return false;

	}

	@Override
	public boolean deposit(double amount) {
	if(amount>0) {
		if(initialOverDraftBalance>overdraftBalance) {
			if(amount<(initialOverDraftBalance-overdraftBalance)) {
				overdraftBalance=overdraftBalance+amount;
				return true;
				
			}
			else {
				amount=amount-(initialOverDraftBalance-overdraftBalance);
				setBalance(getBalance()+amount);
				overdraftBalance=initialOverDraftBalance;
				return true;
						
			}
		}
		else {
			setBalance(getBalance()+amount);
			return true;
		}
	}
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
