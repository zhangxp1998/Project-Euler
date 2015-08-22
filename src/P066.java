import java.math.BigInteger;
import java.util.ArrayList;

public class P066
{
	public static boolean isPerfectSquare(int s)
	{

		int sqrt = (int) (Math.sqrt(s));
		return sqrt * sqrt == s;
	}

	public static ArrayList<Integer> getPeriod(int s)
	{
		ArrayList<Integer> period = new ArrayList<Integer>();

		// if (isPerfectSquare(s))
		// {
		// return period;
		// }

		int m = 0; // m0
		int d = 1; // d0
		int a0 = (int) Math.sqrt(s);// a0 = [s^0.5]
		int a = a0;
		period.add(a0);

		do
		{
			m = d * a - m;
			d = (s - m * m) / d;
			a = (a0 + m) / d;
			period.add(a);
		} while (a != a0 << 1);

		return period;
	}

	public static Fraction expand(ArrayList<Integer> period, int l)
	{
		Period p = new Period(period);
		Fraction f = new Fraction(p.getNumber(l), 1);

		for (int i = l; i > 1; i--)
		{
			f.reciprocal();
			f.add(p.getNumber(i - 1));
		}
		return f;
	}

	public static BigInteger solveX(int d)
	{
		
		if (isPerfectSquare(d))
		{
			return BigInteger.ZERO;
		}
		
		BigInteger x = null;
		ArrayList<Integer> period = getPeriod(d);
		int l = period.size() - 1;
		Fraction f;
		if ((l & 1) == 0)
		{
			f = expand(period, l);
		} else
		{
			f = expand(period, l << 1);
		}
		x = f.getN();
		return x;
	}

	public static void main(String[] args)
	{
		BigInteger max = BigInteger.ZERO;
		int d = 0;
		for(int i = 2; i <= 1000; i ++)
		{
			BigInteger x = solveX(i);
			if(x.compareTo(max) > 0)
			{
				max = x;
				d = i;
			}
		}
		System.out.println("d = " + d);
		System.out.println("x = " + max);
	}

}

class Period
{
	private ArrayList<Integer> numbers;
	private int l;

	public Period(ArrayList<Integer> list)
	{
		numbers = list;
		l = numbers.size() - 1;
	}

	public int getNumber(int index)
	{
		if (index == 1)
		{
			return numbers.get(0);
		} else
		{
			while (index > numbers.size())
			{
				index -= l;
			}
			return numbers.get(index - 1);
		}
	}
}
