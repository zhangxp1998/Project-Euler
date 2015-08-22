
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
		
		for(int i = 2; i <= limit; i ++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
