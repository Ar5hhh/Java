package assignment;
class Book
{
	String Name;
	String ISBN;
	String Author;
	String Publisher;

public Book(String n,String i,String a,String p)
{
	Name=n;
	ISBN=i;
	Author=a;
	Publisher=p;
}
public void setNam(String Name)
{
	this.Name=Name;
}
public void SetIsb(String ISBN)
{
	this.ISBN=ISBN;
}
public void SetAut(String Author)
{
	this.Author=Author;
}
public void SetPub(String Publisher)
{
	this.Publisher=Publisher;
}
public String getNam()
{
	return Name;
}
public String getIsn()
{
	return ISBN;
}
public String getAut()
{
	return Author;
}
public String getPub()
{
	return Publisher;
}
public void getBookInfo()
{
	System.out.println("BOOK INFO");
	System.out.printf("NAME:%s\nISBN:%s\nAUTHOR:%s\nPUBLISHER%s",Name,ISBN,Author,Publisher);
}
}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book[]=new Book[30];
		book[1]=new Book("GAME OF THRONES","9788956601120","GEORGE RR MARTIN","HBO");
		book[1].getBookInfo();

	}

}
