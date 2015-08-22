public class P010
{
	public static void main(String[] args)
	{
		long sum = 2;
		int limit = 200_0000;
		for(int i = 3; i < limit; i += 2)
		{
			if(Library.isPrime(i))
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
