import java.util.Scanner;
public class SpecialNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean  nu = spe(n);
		if(nu==true)
			System.out.println("Number is Special ");
		else
			System.out.println("Not a Special NUmber");
	}
	static boolean spe(int num) {
		int sum=0;
		if(num!=0)
		{

			int r=num%10;
			int d=num/10;

			sum =((r+d)+(r*d));

		}
		return sum==num;
	}


}
