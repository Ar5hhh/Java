package assignment;
class Car
{
	int speed;
	double regularPrice;
	String Color;
	
public Car(int speed,double regularPrice,String color)

{
	this.speed=speed;
	this.regularPrice=regularPrice;
	this.Color=color;
}
public double getSalPri()
{
	return regularPrice;
}
}
class Truck extends Car
{
    int weight;
    double DisPri;
	public Truck(int speed, double regularPrice, String color,int weight) {
		super(speed, regularPrice, color);
		this.weight=weight;
	}
public double getSalPri()
{
	if(weight>2000)
	{
	 DisPri=super.getSalPri()*0.10;
	 
	 return (super.getSalPri()-DisPri);
	}
	else 
	 DisPri=super.getSalPri()*0.20;
	
	 return (super.getSalPri()-DisPri);
}
}
class Ford extends Car
{
	int year;
	int manufDis;

	public Ford(int speed, double regularPrice, String color,int year,int manufDis) {
		super(speed, regularPrice, color);
		this.year=year;
		this.manufDis=manufDis;
	}
	public double getSalPri()
	{
		return (super.getSalPri()-manufDis);
		}
	
}
class Sedan extends Car
{
	int length;
	double DisPri;

	public Sedan(int speed, double regularPrice, String color,int length) {
		super(speed, regularPrice, color);
		this.length=length;
	}
public double getSalPri()
{
	if(length>20)
	{
	 DisPri=super.getSalPri()*0.10;
	 
	 return (super.getSalPri()-DisPri);
	}
	else 
	 DisPri=super.getSalPri()*0.20;
	
	 return (super.getSalPri()-DisPri);

}
}
public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan s=new Sedan(150,1000,"WHITE",21);
		Ford f1=new Ford(160,2000,"RED",2001,10);
		Ford f2=new Ford(200,3000,"BLACK",2002,20);
		Car c=new Car(260,5000,"BLUE");
		
		System.out.println("CAR DETAILS\n");
		System.out.printf("TYPE-SEDAN\nSSPEED:%d\nREGULAR PRICE:%.2f\nCOLOR:%s\nLENGTH:%d\n",s.speed,s.regularPrice,s.Color,s.length);
		System.out.printf("SEDAN PRICE AFTER DISCOUNT:%.2f\n",s.getSalPri());
		
		
		System.out.println("CAR DETAILS\n");
		System.out.printf("TYPE-FORD\nSSPEED:%d\nREGULAR PRICE:%.2f\nCOLOR:%s\nYEAR:%d\nMANUFACTURE DISCOUNT:%d\n",f1.speed,f1.regularPrice,f1.Color,f1.year,f1.manufDis);
		System.out.printf("FORD  PRICE AFTER DISCOUNT:%.2f\n",f1.getSalPri());
		
		System.out.println("CAR DETAILS\n");
		System.out.printf("TYPE-FORD\nSSPEED:%d\nREGULAR PRICE:%.2f\nCOLOR:%s\nYEAR:%d\nMANUFACTURE DISCOUNT:%d\n",f2.speed,f2.regularPrice,f2.Color,f2.year,f2.manufDis);
		System.out.printf("FORD  PRICE AFTER DISCOUNT:%.2f\n ",f2.getSalPri());
		
		
		System.out.println("CAR");
		System.out.printf("SPEED:%d\nREGULAR PRICE:%.2f\nCOLOR:%s\n",c.speed,c.regularPrice,c.Color);
		System.out.printf("PRICE:%.2f",c.getSalPri());
		
		
	}

}
