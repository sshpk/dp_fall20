package pk.cuiatd.dp.adapter.task;

public class Demo {

	public static void main(String[] args) {
		// Object for Xpay
		Xpay xpay = new XpayImpl();
		xpay.setCreditCardNo("4789565874102365");
		xpay.setCustomerName("Syed Sajid Hussain");
		xpay.setCardExpMonth("10");
		xpay.setCardExpYear("25");
		xpay.setCardCVVNo((short)235);
		xpay.setAmount(2565.23);
		PayD payD = new XpayToPayDAdapter(xpay);

		System.out.println(payD.getCardOwnerName());
		System.out.println(payD.getCustCardNo());
		System.out.println(payD.getCardExpMonthDate());
		System.out.println(payD.getCVVNo());
		System.out.println(payD.getTotalAmount());


	}

}
