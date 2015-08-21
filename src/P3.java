public class P3
{
	public static void main(String[] args)
	{
		long n = 600851475143L; // the evil big prime
		long lastFactor = 1;
		long factor = 3;

		// treat 2 separately
		if ((n & 1) == 0)// if n is an even number
		{
			lastFactor = 2;
			n >>= 1;// n /= 2;
			while ((n & 1) == 0)
			{
				n >>= 1;
			}
		}

		long maxFactor = (long) Math.sqrt(n);

		while (n > 1 && factor <= maxFactor)
		{
			if (n % factor == 0)
			{
				n /= factor;
				lastFactor = factor;
				while (n % factor == 0)
				{
					n /= factor;
				}
				
				maxFactor = (long) Math.sqrt(n);

			}
			factor += 2;
		}
		if(n == 1)
		{
			System.out.println(lastFactor);
		}else{
			System.out.println(n);
		}

	}

}
