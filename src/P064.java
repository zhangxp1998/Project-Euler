import java.util.BitSet;

public class P064
{
	public static BitSet bs = null;
	public static boolean isPerfectSquare(int s)
	{
		
//		int sqrt = (int) (Math.sqrt(s));
//		return sqrt * sqrt == s;
		return bs.get(s);
	}

	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{

			@Override
			public void run()
			{
				int count = 0;
				int limit = 1_0000;
				bs = new BitSet(limit + 1);
				int sqrt = (int)Math.sqrt(limit);
				for(int i = 1; i <= sqrt; i ++)
				{
					bs.set(i * i);
				}
				for (int s = 2; s <= limit; s++)
				{
					if (isPerfectSquare(s))
					{
						continue;
					}
					int period = 0;

					int m = 0; // m0
					int d = 1; // d0
					int a0 = (int) Math.sqrt(s);//a0 = [s^0.5]
					int a = a0;

					do
					{
						m = d * a - m;
						d = (s - m * m) / d;
						a = (a0 + m) / d;
						period ++;
					} while (a != a0 << 1);
					
					if((period & 1) == 1)
					{
						count ++;
					}
				}
				System.out.println("Count = " + count);

			}
			
		};
		
		long ms = Library.time(r);
		System.out.println(ms);
	}

}
