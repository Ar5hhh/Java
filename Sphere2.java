package assignment;
import java.util.*;
class Volumes
{
     public void sphereVolume(double r)
	{
	
	 double v=4.0/3.0*3.14*(r*r*r);
	System.out.printf("VOLUME OF THE SPHERE:%.2f",v);
	}


}
public class Sphere2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		Scanner s=new Scanner(System.in);
		System.out.println("RADIUS OF THE SPHERE:");
		r=s.nextDouble();
		Volumes vo=new Volumes();
		vo.sphereVolume(r);
		
		}

}
