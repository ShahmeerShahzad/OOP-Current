import java.util.Scanner;
public class UserTest {
	public static void main(String args[]) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		UserInfo obj = new UserInfo();
		
		String nameInput;
		String passInput;
		
		System.out.println("Enter your username: ");
		nameInput = input1.next();
		
		System.out.println("Enter your password: "); 
		passInput = input2.next();

		if(nameInput.equals(obj.getUsername())) 
		{
			if(passInput.equals(obj.getPassword())) 
			{
				System.out.println("Information entered correctly.");
			}
			
			else 
			{
				System.out.println("Information entered incorrectly.");
			}
		}

		else {
			System.out.println("Information entered incorrectly.");
			}
	}
}