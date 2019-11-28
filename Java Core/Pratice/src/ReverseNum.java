import java.util.Scanner;

public class ReverseNum {

	public int rev(int n)
	{
		int sum=0, count=0;
		while(n>0) {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
			count++;
		}
	System.out.println("Number of digit in the number "+count);
		return sum ;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		ReverseNum r = new ReverseNum();
		System.out.println("Reverse of the number is "+r.rev(num));

	}
}
