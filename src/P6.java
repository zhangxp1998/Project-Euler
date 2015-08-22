

public class P6
{

	public static void main(String[] args)
	{
		//gauss formula
		int n = 100;
		System.out.println((int)Math.pow(((1 + n) * n >> 1), 2) - ((n << 1) + 1) * (n + 1) * n / 6);
	}

}
