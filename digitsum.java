class digitsum
{
	public static void main(String...args)
	{
		int a=545;
		int r1=a%10;
		System.out.print(r1);
	
		 a=a/10;
		int r2=a%10;
		System.out.print(r2);

		int r3=a/10;
		System.out.println(r3);
		
		int sum=r1+r2+r3;
		System.out.println("Sum of digits is:" +sum);
	}
}
	

		
		