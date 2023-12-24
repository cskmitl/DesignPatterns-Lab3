public interface PaymentProvider {
	void pay();
}

public class PaymentController {

	private PaymentProvider paymentMethod;

	public void setPaymentMethod(PaymentProvider paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void pay() {
		paymentMethod.pay();
	}
}