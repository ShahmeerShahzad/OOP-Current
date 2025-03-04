package banking;
import util.PinValidator;

public class BankingSystem {
	private static final String storedAccountNumber = "001";
	private static final String storedPin = "1111";

	public static class LoginProcessor {
		public static boolean authenticate(String accountNumber, String pin) {
			if (PinValidator.Rules.isValid(pin)) {
				return storedAccountNumber.equals(accountNumber) && storedPin.equals(pin);
			}
			else {
				return false;
			}
		}			
	}
}
