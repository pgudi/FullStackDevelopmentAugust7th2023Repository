package p1;
class demo
{
	void displayoutput()
	{
		String s1="M Y S O R E";
		String s3="";
		String[] s2=s1.split(" ");
		for(int i=s2.length/2;i<s2.length;i++)
		{
			s3=s3+s2[i];
		}
		System.out.print(s3);

	}
}

public class Demo1 {

	public static void main(String[] args) {
		demo obj=new demo();
		obj.displayoutput();
	}

}
