public class Library
{
	public static long time(Runnable r)
	{
		long start = System.currentTimeMillis();
		r.run();
		long ends = System.currentTimeMillis();
		return ends - start;
	}

	public static boolean isPrime(long n)
	{
		long limit = (long) Math.sqrt(n);
		if (n <= 1)
		{
			return false;
		}
		
		if (n == 2)
		{
			return true;
		}
		
		if ((n & 1) == 0)
		{
			return false;
		}
		for (int i = 3; i <= limit; i += 2)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
