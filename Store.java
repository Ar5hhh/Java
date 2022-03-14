package assignment;
class Invoice
{
	 String partnumber;
	 String partdescription;
	 int quantity;
	 double price;
	 double InoAmo;
	
public Invoice(String pn,String pd,int q,double p)
	{
	partnumber=pn;
	partdescription=pd;
	
	if(q>0)
	{
		quantity=q;
	}
	else 
	
		quantity=0;
	
	if(p>0)
	{
		price=p;
	}
	else
		price=0;
	}

public void setPartnum(String pn) 
{
	partnumber=pn;
}
public void setPartdes(String pd)
{
	partdescription=pd;
}
public void setQuan(int q)
{
		quantity=q;
}
public void setPri(double p)
{
		price=p;
}
	
public String getPartnum()
{
	return partnumber;
}
public String getPartdes()
{
	return partdescription;
}
public int getQuan()
{
	return quantity;
}
public double getPri()
{
	return price;
}

public double getInvoiceAmount()
{
	
	double InvoAmo=quantity*price;
	return InvoAmo;
}
	}
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice i=new Invoice("007","SNIPER",2,10000);
		System.out.printf("INVOICE\n PARTNUMBER:%s\n PART DESCRIPTION:%s\n QUANTITY:%d\n PRICE:%.2f\n",i.getPartnum(),i.getPartdes(),i.getQuan(),i.getPri());
		System.out.printf("INVOICE AMOUNT:QUANTITY x PRICE= %.2f",i.getInvoiceAmount());
		

	}

}
