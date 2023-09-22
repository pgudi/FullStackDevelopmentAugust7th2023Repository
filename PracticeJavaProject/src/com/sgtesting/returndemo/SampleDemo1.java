package com.sgtesting.returndemo;
class Sample1
{
	static double[] getDoubleREverseArray(double[] d)
	{
		double a[]=new double[d.length];
		int k=0;
		for(int i=d.length-1;i>=0;i--)
		{
			a[k]=d[i];
			k=k+1;
		}
		return a;
	}
}
public class SampleDemo1 {
	public static void main(String[] args) {
		double y[]= {1.1,2.2,3.3,4.4};
		double x[]=Sample1.getDoubleREverseArray(y);
		for(double kk:x)
		{
			System.out.println(kk);
		}
	}

}
