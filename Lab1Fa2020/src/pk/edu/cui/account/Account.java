package pk.edu.cui.account;

import java.util.Vector;

public class Account {
	private String title;
	private int balance;
	private Vector<Transaction> history = new Vector<Transaction>();
	
	public Account(String title) {
		this.title = title;
	}
	boolean checkTransaction(Transaction transaction){
		if(transaction.getType().equals("debit")
				&&transaction.getAmount()>balance){
			return false;
		}
		else
			return true;
	}
	public void post (Transaction transaction){
		if(checkTransaction(transaction)){
			if(transaction.getType().equals("debit")){
				balance = balance - transaction.getAmount();
				history.add(transaction);
				System.out.println("debit transaction done ...");
			}
			else if (transaction.getType().equals("credit")){
				balance = balance + transaction.getAmount();
				history.add(transaction);
				System.out.println("credit transaction done ...");
			}
			else{
				System.out.println("Transaction not supported");
			}
		}
		else{
			System.out.println("Transaction can not be done");
		}
	}
	public String getTitle() {
		return title;
	}
	public int getBalance() {
		return balance;
	}
}
