public class P7
{

	public static void main(String[] args)
	{
		int limit = 10001;
		int count = 1;// 2 is the first prime
		int prime = 0;
		for (int i = 3;; i += 2)
		{
			if (Library.isPrime(i))
			{
				count++;
				if(count == limit)
				{
					prime = i;
					break;
				}
			}
		}
		
		System.out.println(prime);
	}

}
