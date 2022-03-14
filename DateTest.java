package assignment;
class Date
{
	int month;
	int day;
	int year;
	
public Date(int m,int d,int y)
{
	if(m<12)
	{
		month=m;
	}
	else
	{
		System.out.println("INVALID MONTH");
	}
	if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&(d<=31))
	{
			day=d;
		}
	else if((m==4||m==6||m==9||m==11)&&d<=30)
	{
		day=d;
	}
	else if((m==2)&&(d==28||d==29))
	{
		day=d;
	}
	else
	{
		System.out.println("INVALID DAY");
	}
	year=y;
}
public void setMon(int m)
{
     month=m;
	
}
public void setDay(int d) 
{
	day=d;
   
}
public void setYear(int y)
{
	year=y;
}
public int getMon()
{
	return month;
}
public int getDay()
{
	return day;
}
public int getYear()
{
	return year;
}
}
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date q=new Date(3,24,2001);
		System.out.printf("DATE\n%d/%d/%d",q.getMon(),q.getDay(),q.getYear());

	}

}
