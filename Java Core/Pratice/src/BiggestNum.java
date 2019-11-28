import java.util.Scanner;
public class BiggestNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Three NUmber is ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Biggest number is "+big(a,b,c));
	}
	static int big(int a ,int b , int c) {
		int bigger=((a>b)&&(a>c)?a:(b>c)?b:c);
		return bigger;
	}
}
