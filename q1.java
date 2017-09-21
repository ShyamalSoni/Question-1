import java.io.*;
import java.util.*;

class q1
{

	public static void main(String[] args)
	{
			double r,h,in_area=0,out_area=0,l,w,e,in_amt=0,out_amt=0;
			double final_amt;
			final int cost_aluminum=5,cost_steel=10,cost_copper=15,cost_gold=100,cost_silver=80,cost_bronze=50; //Prices are defined for per square meter
			double pi=3.14;
			System.out.println("Please Select the area for which you need to find the cost"); // Here we are inputting the shapes by user
			System.out.println("1. Sphere");
			System.out.println("2. Cylinder");
			System.out.println("3. Cube");
			System.out.println("4. Cuboid");
			Scanner sc=new Scanner(System.in);
			int ch_shape = sc.nextInt();
			System.out.flush();
			System.out.println("Please select the metal to be built on"); //Here we are inputting the material for which it id to be build on
			System.out.println("1. Aluminum");
			System.out.println("2. Steel");
			System.out.println("3. Copper");
			int ch_material=sc.nextInt();
			System.out.flush();
			System.out.println("Please select the coating material"); // Here we are selecting the coating material for shape
			System.out.println("1. Gold");
			System.out.println("2. Silver");
			System.out.println("3. Bronze");
			int ch_coating=sc.nextInt();
			System.out.flush();
			System.out.println("Please enter thickness of coating material"); // Here we'll input thickness for the coating
			double thick=sc.nextDouble();
			
			switch(ch_shape)
			{
				case 1:
						System.out.println("Sphere");
						System.out.println("Please enter radius for your sphere trophy");
						r=sc.nextDouble();
						in_area=(4/3)*pi*(r*r*r);	//This calcuation is done for calculating inner area
						out_area=4*pi*(r+thick*r+thick); //This calcuation is done for calculating outer area + the thickness of material
						break;
				case 2:
						System.out.println("Cylinder");
						System.out.println("Please enter radius for your cylinder tophy");
						r=sc.nextDouble();
						System.out.println("Please enter height for your cylinder trophy");
						h=sc.nextDouble();
						in_area= pi*(r*r)*(h*h);
						out_area=2*pi*(r+thick)*h+(2*(22/7)*((r+thick)*(r+thick)));
						break;
				case 3:
						System.out.println("Cube");
						System.out.println("Please enter edge for your cube trophy");
						e=sc.nextDouble();
						in_area=e*e*e;
						out_area=6*((e+thick)*(e+thick));
						break;
				case 4:
						System.out.println("Cuboid");
						System.out.println("Please enter height for your cuboid trophy");
						h=sc.nextDouble();
						System.out.println("Please enter width for your cuboid trophy");
						w=sc.nextDouble();
						System.out.println("Please enter length for your cuboid trophy");
						l=sc.nextDouble();
						in_area=2*((l*w)+(w*h)+(h*l));
						out_area=2*(((l+thick)*(w+thick))+((w+thick)*(h+thick))+((h+thick)*(l+thick)));
						break;
			}
			switch(ch_material) // Here calculation is done on the basis of material that is selected
			{
				case 1:
						in_amt=in_area*cost_aluminum;
						break;
				case 2:
						in_amt=in_area*cost_steel;
						break;
				case 3:
						in_amt=in_area*cost_copper;
						break;
			}
			switch(ch_coating)	//Here amount is calculated as per the coating material
			{
				case 1:
						out_amt=out_area*cost_gold;
						break;
				case 2:
						out_amt=out_area*cost_silver;
						break;
				case 3:
						out_amt=out_area*cost_bronze;
						break;
			}
			final_amt=in_amt+out_amt;
			System.out.println("The total amount that would be incurred for your trophy is"+final_amt);// This is the final amount that is incurred
	}
}