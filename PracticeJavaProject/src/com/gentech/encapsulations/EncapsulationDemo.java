package com.gentech.encapsulations;
class Bank
{
	private String bankName;
	private int accountNo;
	
	public void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	
	public String getBankName()
	{
		return bankName;
	}
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	
	public int getAccountNo()
	{
		return accountNo;
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Bank o=new Bank();
		o.setBankName("ICICI Bank");
		String name=o.getBankName();
		System.out.println(name);

		o.setAccountNo(10000011);
		int acc=o.getAccountNo();
		System.out.println(acc);
	}

}
