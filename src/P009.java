public class P009
{

	public static void main(String[] args)
	{
		outer: for (int a = 1; a < 998; a++)
		{
			for (int b = a; b < 998; b++)
			{
				int c = 1000 - a - b;
				if (c >= a + b)
				{
					continue;
				}
				int sum = Library.pow(a, 2) + Library.pow(b, 2);
				int cSquare = Library.pow(c, 2);
				if (sum > cSquare)
				{
					continue outer;
				} else if (sum == cSquare)
				{
					System.out.println(a * b * c);
					return;
				}
			}
		}
		System.out.println("Not found");
	}

}
