package main;
import banking.BankingSystem;
import java.io.Console;

public class BankApplication {
	public static void main(String args[]) {
		Console console = System.console();

		String accountNumber = console.readLine("Enter your account number: ");
		char[] PassChar = console.readPassword("Enter your password: ");
		String pin = new String(PassChar);

		PinValidator validator = new PinValidator();
		Rules rules = validator.new Rules();
		LoginProcessor login = new LoginProcessor();
		
		if(login.authenticate(accountNumber, pin)) {
			System.out.println("Access Granted");
		}
		else {
			System.out.println("Access Not Granted");
		}
	}
}
		
		
		
		 
	
		