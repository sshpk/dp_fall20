package pk.edu.cui.account;

public class AccountPlus extends Account{
	private int credit;

	public AccountPlus(String title, int credit) {
		super(title);
		this.credit = credit;
		
	}
	boolean checkTransaction(Transaction transaction){
		if(transaction.getType().equals("debit")
				&&transaction.getAmount()>(getBalance()+credit)){
			return false;
		}
		else
			return true;
	}

}
