package pk.edu.cui.account;

public class Demo {

	public static void main(String[] args) {
		Account account = new Account("Sajid");
		Transaction transaction1 = new Transaction("credit", 100);
		account.post(transaction1);
		
		Transaction transaction2 = new Transaction("debit", 50);
		account.post(transaction2);
		
		System.out.println(account.getBalance());

	}

}
