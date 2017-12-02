import java.util.*;
import java.lang.Math;
class Distance 
{
	public static void main(String[] args) 
	{
		int x[]={10,6,8,10,12};
		int y[]={5,7,9,11,13};
		double c[][]=new double[5][5];
		double z[]=new double[5];
		dist(x,y,c);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y value of three points");
		for(int i=0;i<3;i++)
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculateArray(a,b,z,x,y);
		}
	}
	static void dist(int x[],int y[],double c[][])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				double d=Math.sqrt(((x[j]-x[i])*(x[j]-x[i]))+((y[j]-y[i])*(y[j]-y[i])));
				double r=(double)Math.round(d*100)/100;
				c[i][j]=r;
			}
		}
		printMatrix(c);
	}
	static void calculateArray(int a,int b,double z[],int x[],int y[])
	{
	for(int i=0;i<5;i++)
		{
		double d1=Math.sqrt(((a-x[i])*(a-x[i]))+((b-y[i])*(b-y[i])));
		double r1=(double)Math.round(d1*100)/100;
		z[i]=r1;
		}
		printArray(z);
		min(z);
	}
	static void printArray(double z[])
	{
        for(int i=0;i<5;i++)
		{
	System.out.println(z[i]+"\t");
		}
	}
	static void printMatrix(double c[][])
	{
		System.out.println();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static void min(double z[])
	{
		double min=z[0];
		for (int i=0;i<5;i++)
		{
			if(min>z[i])
			{
				 min=z[i];
			}
		}
		
		for (int i=0;i<5;i++)
		{
			if(min==z[i])
			{
				System.out.println("The enterd point is nearest to"+(i+1)+"st point");
			}
		}
	
	}
}
