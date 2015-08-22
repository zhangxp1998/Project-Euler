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

		if (n < 4)
		{
			return true;
		}

		if ((n & 1) == 0)
		{
			return false;
		}
		
		if(n < 9)
		{
			return true;
		}
		if(n % 3 == 0)
		{
			return false;
		}
		
		for (int i = 5; i <= limit; i += 6)
		{
			if (n % i == 0)
			{
				return false;
			}
			if(n % (i + 2) == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static int pow(int b, int e)
	{
		if (e == 1)
		{
			return b;
		}
		if (e == 2)
		{
			return b * b;
		}
		if ((b & 1) == 0)
		{
			int tmp = pow(b, e >> 1);
			return tmp * tmp;
		} else
		{
			int tmp = pow(b, (e - 1) >> 1);
			return tmp * tmp * b;
		}
	}
	
	public static long pow(long b, long e)
	{
		if (e == 1)
		{
			return b;
		}
		if (e == 2)
		{
			return b * b;
		}
		if ((b & 1) == 0)
		{
			long tmp = pow(b, e >> 1);
			return tmp * tmp;
		} else
		{
			long tmp = pow(b, (e - 1) >> 1);
			return tmp * tmp * b;
		}
	}
}
