import java.util.ArrayList;

public class P61
{

	@SuppressWarnings("unchecked")
	public static ArrayList<Integer>[][] table = new ArrayList[9][100];

	public static void main(String[] args)
	{
		for (int i = 0; i < table.length; i++)
		{
			for (int j = 0; j < table[i].length; j++)
			{
				table[i][j] = new ArrayList<Integer>();
			}
		}

		for (int i = 3; i <= 8; i++)
		{
			for (int j = 1;; j++)
			{
				int n = figurateNumber(i, j);
				if (n >= 10000)
				{
					break;
				}
				if (n < 1000)
				{
					continue;
				}
				table[i][n / 100].add(n);
			}
		}

		for (int i = 10; i < 100; i++)
		{
			for (int n : table[3][i])
			{
				int sum = findSolution(n, n, 1 << 3, n);
				if(sum != -1)
				{
					System.out.println(sum);
					return;
				}
			}

		}

	}

	public static int findSolution(int begin, int current, int sidesUsed, int sum)
	{
		if(sidesUsed == 0b1_1111_1000)
		{
			if(current % 100 == begin / 100)
			{
				return sum;
			}
		}
		
		for(int i = 4; i <= 8; i ++)
		{
			if(((sidesUsed >>> i) & 1) == 1)
			{
				continue;
			}
			for(int n : table[i][current % 100])
			{
				int tmp = findSolution(begin, n, sidesUsed | (1 << i), sum + n);
				if(tmp != -1)
				{
					return tmp;
				}
			}
		}
		
		return -1;
	}

	public static int figurateNumber(int sides, int n)
	{
		return n * ((sides - 2) * n - (sides - 4)) / 2;
	}

}
