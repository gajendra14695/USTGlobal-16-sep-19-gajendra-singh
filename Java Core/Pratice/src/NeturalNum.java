import java.util.Scanner;
public class NeturalNum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num =sc.nextInt();
	netural(num)
;	
}
public static void netural(int n) {
	int sum=0;
	for(int i=0;i<=n;i++) {
		sum=sum+i;
		
	}
	System.out.println("Sum of the Natural number is "+sum);
}
}
