
public class P2
{

	public static void main(String[] args)
	{
		int f1 = 1;
		int f2 = 1;
		int f3 = f1 + f2;
		int sum = 0;
		while(f3 <= 4000_000)
		{
			if((f3 & 1) == 0)
			{
				sum += f3;
			}
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
		System.out.println(sum);
	}

}
