package nm;

public class BankAccount {
	private int balance;
	private int minBalance;
	private String owner;
	 public BankAccount(int balance, int minBalance,String owner) {
	        this.balance = balance;
	        this.minBalance = minBalance;
	        this.owner=owner;
	    }
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance>minBalance)
		this.balance = balance;
	}
	public int getMinBalance() {
		return minBalance;
	}
	public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
	public void deposit(int amount) {
		balance+=amount;
	}
	public boolean transfer(BankAccount target, int amount) {
		if(target.withdraw(amount)) {
			deposit(amount);
			return true;
		}
		return false;
	}
	public String toString() {
        return "balance of " +owner+": "+ balance;
    }
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	 
}
