package Athmini_test;
import java.util.Scanner;

class reversenumber {
	static int reverse(int n) {
		int rev=0;
		int rem;
		while(n>0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;	
		}
		return rev;
		}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println();
		int n1=s.nextInt();
		System.out.println(reverse(n1));
		
	
	}
}
