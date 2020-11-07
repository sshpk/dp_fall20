package pk.cuiatd.dp.chain.lab;

public class BankEmployee extends BaseApprover{
	private String title;
	private int approvalLimit;

	public BankEmployee(String title, int approvalLimit) {
		this.title = title;
		this.approvalLimit = approvalLimit;
	}

	@Override
	public void process(Loan loan) {
		if(loan.getAmount()<=approvalLimit){
			System.out.println(loan+" is approved by "+title);
		}
		else if(next!=null){
			System.out.println(title+" forwards the loan "+loan.getNumber()+" for processing");
			next.process(loan);
		}
		else{
			System.out.println(loan+" cannot be processed");
		}
		
	}
	
}
