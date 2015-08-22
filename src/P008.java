import java.util.Scanner;

public class P008
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		Scanner s = new Scanner(P008.class.getResourceAsStream("res/1000digit"));
		while (s.hasNext())
		{
			sb.append(s.nextLine());
		}
		s.close();
		char[] digits = sb.toString().toCharArray();
		int limit = digits.length - 12;
		long max = 0;
		for (int i = 0; i < limit; i++)
		{
			long product = 1;
			for(int j = 0; j < 13; j ++)
			{
				product *= digits[i + j] - '0';
			}
			if(product > max)
			{
				max = product;
			}
		}
		System.out.println(max);

	}

}
