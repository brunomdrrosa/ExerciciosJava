package fixacaoPOO.exercicioDolar;

public class CurrencyConverter {

	public static double tax = 0.06;

	public static double finalAmount(double dollar, double quantity) {
		return dollar * quantity * (tax + 1.0);
	}

}
