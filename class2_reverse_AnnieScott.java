package class2;

public class reversenumber {
	public static void main(String[] args) {
		int n=234;
		int r;
		int rev=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
			
		}
		System.out.print("reverse is:"+rev);
		
	}
}



