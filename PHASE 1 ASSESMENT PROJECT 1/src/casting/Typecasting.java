package casting;
import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner d = new Scanner(System.in);
		System.out.print("Enter a numbers : ");
		x=d.nextInt();
		long y=x;
		float c=y;
		System.out.println("Before type casting ,int value:" +x);
		System.out.println("After type casting ,long value:" +y);
		System.out.println("After type casting ,float value:" +c);

	}

}
