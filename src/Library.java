
public class Library
{
	public static long time(Runnable r)
	{
		long start = System.currentTimeMillis();
		r.run();
		long ends = System.currentTimeMillis();
		return ends - start;
	}
}
