public class P063
{
	public static int getNumDigits(double n)
	{
		return (int) (Math.log10(n) + 1);
	}

	public static void main(String[] args)
	{
		int count = 0;
		for (int i = 0; i < 10; i++)
		{
			for (int e = 0;; e++)
			{
				double power = Math.pow(i, e);
				int digits = getNumDigits(power);
				if (digits < e)
				{
					break;
				}
				if (digits == e)
				{
					System.out.println(i + " ^ " + e + " = " + power);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
