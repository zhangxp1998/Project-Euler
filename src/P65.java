import java.math.BigInteger;

public class P65
{

	public static void main(String[] args)
	{
		byte[] a = new byte[101];
		a[0] = 2;
		for (int i = 1; i <= 100; i++)
		{
			if (i % 3 != 2)
			{
				a[i] = 1;
			} else
			{
				a[i] = (byte) ((i / 3 + 1) << 1);
			}
		}

		int n = 99;
		Fraction f = new Fraction(a[n], 1);
		for (int i = n; i >= 1; i--)
		{
			f.reciprocal();
			f.add(a[i - 1]);
		}
		String numerator = f.getN();
		System.out.println(numerator);
		char[] chars = numerator.toCharArray();
		int sum = 0;
		for (int i = 0; i < chars.length; i++)
		{
			sum += (chars[i] - '0');
		}
		System.out.println(sum);
	}

}

class Fraction
{
	private BigInteger d;// ·ÖÄ¸
	private BigInteger n;// ·Ö×Ó

	public void add(int i)
	{
		BigInteger tmp = d.multiply(new BigInteger(i + ""));
		n = n.add(tmp);
	}

	public void reciprocal()
	{
		BigInteger tmp = d;
		d = n;
		n = tmp;
	}

	public Fraction(int n, int d)
	{
		this.d = new BigInteger(d + "");
		this.n = new BigInteger(n + "");
	}

	public String getN()
	{
		return n.toString();
	}

	public String toString()
	{
		return n + "/" + d;
	}
}