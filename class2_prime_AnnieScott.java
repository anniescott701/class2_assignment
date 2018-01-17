package class2;

public class prime
{
	public static void main(String[] args)
	{
		int n=8;
		int a=2;
		int count=0;
		while(a<n)
			{
				if(n==2)
				break;
					else if(n%a==0)
						count++;
						a++;
						}
						if(count==0) 
						{
							System.out.println("It is a prime number->"+n);
	
						}
						else
						{
							System.out.println("It is not a prime number->"+n);
						}
			}

}

