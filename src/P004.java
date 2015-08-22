public class P004
{
	public static long reverse(long n)
	{
		long reversed = 0;
		while (n > 0)
		{
			reversed = 10 * reversed + n % 10;
			n /= 10;
		}
		return reversed;
	}

	public static boolean isPalindrome(long n)
	{
		return n == reverse(n);
	}

	public static void main(String[] args)
	{
		int max = 0;
		for (int i = 999; i >= 100; i--)
		{
			for (int j = 999; j >= i; j--)
			{
				int p = i * j;
				if (p > max && isPalindrome(p))
				{
					max = i * j;
				}
			}
		}

		System.out.println(max);

	}

}
