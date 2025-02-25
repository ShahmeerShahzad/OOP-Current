import java.util.Scanner;
public class InputDemo{
	
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		Scanner strinput = new Scanner(System.in);

		System.out.println("This is an input demo code.");

		//integer
		Byte b;
		int i;
		short s;
		long l;

		float f;
		double d;

		boolean bool;

		System.out.print("Enter a byte: ");
		b = input.nextByte();
		
		System.out.print("Enter an integer: ");
		i = input.nextInt();

		System.out.printf("Integer i = %03d \n", i);

		System.out.print("Enter a short byte: ");
		s = input.nextShort();
		
		System.out.print("Enter a long byte: ");
		l = input.nextLong();

		System.out.print("Enter a  float: ");
		f = input.nextFloat();

		System.out.printf("Float f = %,.1f \n", f);

		System.out.print("Enter a  double: ");
		d = input.nextDouble();
		
		System.out.printf("Double d = %,.2f \n", d);
		
		System.out.print("Enter a boolean: ");
		bool = input.nextBoolean();
		
		System.out.printf("Boolean bool = %b \n", bool);
		System.out.print("Enter a string: ");
		String str = input.next();

		System.out.printf("%30s \n", str);

		System.out.print("Enter a string with spaces: ");
		String str1 = strinput.nextLine();
		
		System.out.printf("%s", str1);
		
	}
}
