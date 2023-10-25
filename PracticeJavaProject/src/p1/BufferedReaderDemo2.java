package p1;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo2 {

	public static void main(String[] args) {
		ReadContent();
	}
	private static void ReadContent() {
		BufferedReader br=null;
		FileReader fr=null;
		try
		{
			fr=new FileReader("D:\\Demo\\Example\\Test.txt");
			br=new BufferedReader(fr);
			String strline=" ";
			while((strline=br.readLine())!=null)
			{			
				System.out.println(strline);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	

}
