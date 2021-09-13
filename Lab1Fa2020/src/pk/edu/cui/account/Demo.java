package pk.edu.cui.account;

public class Demo {

	public static void main(String[] args) {
		Account account = new Account("Sajid");
		Transaction transaction1 = new Transaction("credit", 100);
		account.post(transaction1);
		
		Transaction transaction2 = new Transaction("debit", 50);
		account.post(transaction2);
		
		System.out.println(account.getBalance());
		System.out.println("using AccountPlus Now");
		
		
		AccountPlus accountPlus = new AccountPlus("Raffay", 1000);
		Transaction transaction3 = new Transaction("credit", 100);
		accountPlus.post(transaction3);
		
		Transaction transaction4 = new Transaction("debit", 1100);
		accountPlus.post(transaction4);
		
		System.out.println("remaining balance (AccountPlus) is: "+accountPlus.getBalance());

	}

}
