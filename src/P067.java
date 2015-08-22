import java.util.Scanner;

public class P067
{

	public static void main(String[] args)
	{
		int[][] triangle = new int[100][100];
		Scanner s = new Scanner(P067.class.getResourceAsStream("res/triangle"));
		int row = 0;
		while (s.hasNext())
		{
			String str = s.nextLine();
			String[] strings = str.split(" ");
			for (int i = 0; i < strings.length; i++)
			{
				triangle[row][i] = Integer.parseInt(strings[i]);
			}
			row++;
		}
		
		for(int i = 99; i > 0; i --)
		{
			for(int j = 0; j < i; j ++)
			{
				triangle[i - 1][j] += triangle[i][j] > triangle[i][j + 1] ? triangle[i][j] : triangle[i][j + 1];
			}
		}
		s.close();
		System.out.println(triangle[0][0]);
	}

}
