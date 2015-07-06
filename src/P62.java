import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P62
{

	public static String getDigits(long n)
	{
		char[] digits = Long.toString(n).toCharArray();
		Arrays.sort(digits);
		return new String(digits);
	}

	public static void main(String[] args)
	{
		Map<String, Long> map = new HashMap<String, Long>();
		Map<String, Long> num = new HashMap<String, Long>();
		
		for (long i = 1;; i++)
		{
			long cube = i * i * i;
			String s = getDigits(cube);
			if (!map.containsKey(s))
			{
				map.put(s, 1L);
				num.put(s, cube);
			} else
			{
				map.put(s, map.get(s) + 1);
				if(num.get(s) > cube)
				{
					num.put(s, cube);
				}
			}
			if(map.get(s) == 5)
			{
				System.out.println(num.get(s));
				break;
			}
		}
	}
}
