
public class P001
{
	public static int sum(int n)
	{
		return (n + 999 / n * n) * (999 / n) / 2;
	}
	public static void main(String[] args)
	{
		System.out.println(sum(3) + sum(5) - sum(15));
		
	}
}
