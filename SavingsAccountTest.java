package assignment;
class SavingsAccount
{
	  static double annualinterestrate;
      double savingbalance;

 public SavingsAccount()
{
 annualinterestrate = 0;
 savingbalance=0;
}
public SavingsAccount(double IniRate,double SavBal)
{
	 annualinterestrate = IniRate;
	savingbalance=SavBal;
}
public double calculateMonthlyInterest()
{
	double IniRate = savingbalance*annualinterestrate/12;
	savingbalance+=IniRate;
	return IniRate;
}
public static void modifyInterestRate(double newIvalue)
{
	annualinterestrate=newIvalue;
}
public void setSavingBal(double Nbal )
{
	savingbalance=Nbal;
}
public double getSavingBal()
{
	return savingbalance;
}

}
public class SavingsAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1=new SavingsAccount();
		saver1.setSavingBal(2000);
		SavingsAccount saver2=new SavingsAccount();
		saver2.setSavingBal(3000);
		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("SAVER1 BALANCE:%.2f\n",saver1.getSavingBal());
		System.out.printf("SAVER2 BALANCE:%.2f\n",saver2.getSavingBal());
		
		
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("SAVER1 NEXT BALANCE:%.2f\n",saver1.getSavingBal());
		System.out.printf("SAVER2 NEXT BALANCE:%.2f",saver2.getSavingBal());
		
		
	}

}
