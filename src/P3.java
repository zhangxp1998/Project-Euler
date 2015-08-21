public class P3
{
	public static void main(String[] args)
	{
		long l = 600851475143L;
		int limit = (int) Math.sqrt(l);
		long result = 0;

		for (long i = 2; i <= limit; i++)
		{
			if (l % i == 0)
			{
				if (i > result && Library.isPrime(i))
				{
					result = i;
				}
				long tmp = l / i;
				if (tmp > result && Library.isPrime(tmp))
				{
					result = tmp;
				}
			}
		}

		System.out.println(result);
	}

}
