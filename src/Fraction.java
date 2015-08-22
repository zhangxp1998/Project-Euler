import java.math.BigInteger;

public class Fraction
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

	public BigInteger getN()
	{
		return n;
	}
	
	public BigInteger getD()
	{
		return d;
	}

	public String toString()
	{
		return n + "/" + d;
	}
}