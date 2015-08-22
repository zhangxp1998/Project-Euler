public class P005
{

	public static void main(String[] args)
	{
		int[] arr = {19, 17, 13, 11, 18, 16, 15, 14, 12};
		outer: for(int i = 20;;i += 20)
		{
			for(int j = 0; j < arr.length; j ++)
			{
				if(i % arr[j] != 0)
				{
					continue outer;
				}
			}
			System.out.println(i);
			break;
		}
	}

}
