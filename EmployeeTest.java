package assignment;
class Employee
{
	String firstname;
	String lastname;
	double salary;
	double RaiseAmo;
	
	
public Employee(String fn,String ln,double s)
{
	firstname=fn;
	lastname=ln;
	if(s>0)
	{
		salary=s*12;
	}
	else 
		salary=0;
}
public void  setFirNam(String fn)
{
	firstname=fn;
}
public void setLasNam(String ln)
{
	lastname=ln;
}
public void setSal(double s)
{
		salary=s;
	
	
}
public String getFirNam()
{
	return firstname;
	
}
public String getLasNam()
{
	return lastname;
}
public double getSal()
{
	return salary;
}
public double getRaiseAmo()
{
	double RaiseAmo=salary;
	return RaiseAmo;
}
}
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Mohamed","Arsh",10000);
		Employee e1=new Employee("DUA","LIPA",20000);
		System.out.printf("EMPLOYEE DETAILS\n  FIRST NAME:%s\n  LAST NAME:%s\n  SALARY(PER YEAR): %.2f\n",e.getFirNam(),e.getLasNam(),e.getSal());
		System.out.printf("AFTER 10 PERCENT RAISE\n  SALARY(PER YEAR):%.2f\n",e.getRaiseAmo()*1.1);
		System.out.printf("EMPLOYEE DETAILS\n  FIRST NAME:%s\n  LAST NAME:%s\n  SALARY(PER YEAR): %.2f\n",e1.getFirNam(),e1.getLasNam(),e1.getSal());
		System.out.printf("AFTER 10 PERCENT RAISE\n  SALARY(PER YEAR):%.2f",e1.getRaiseAmo()*1.1);

	}

}
