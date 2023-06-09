package Athmini_test;

public class fabbinoci {
	static int fab(int n) {
		
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return fab(n-1)+fab(n-2);
		}
	}
	public static void main(String args[]) {
		System.out.print(fab(6));
	}

}
