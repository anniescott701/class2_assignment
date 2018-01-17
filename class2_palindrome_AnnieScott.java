package class2;

public class palindrome {
	public static void main(String[] args) {
		int n=321;
		int r;
		int rev=0;
		int p=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(p==rev)
		{
			System.out.print("It is a palindrome number");
		}
		else
		{
			System.out.print("It is not a palindrome number");
		}

}
}
