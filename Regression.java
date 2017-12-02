import java.util.*;
import java.lang.Math;
class Regression 
{
	public static void main(String[] args) 
	{
		int x[]={91,97,108,121,67,124,51,73,111,57};
		int y[]={71,75,69,97,70,91,39,61,80,47};
		int p=0,q=0,r=0,s=0;
		for(int i=0;i<10;i++)
		{
			p=p+x[i];
			q=q+y[i];
			r=r+(x[i]*x[i]);
			s=s+(x[i]*y[i]);
		
		}
		System.out.println("Now solving Two Linear Equation to find the values of a and b"+"\n"+"y=Na+bx"+"\n"+"xy=ax+bx^2");
		solveEquation(p,q,r,s,10);
	     findClass(x,y);
	}
	static void solveEquation(int p,int q,int r,int s,int n)
	{
		
		int m[][]=new int[2][2];
		int d[][]=new int[2][1];
	//solving the equation using cramer's rule
	m[0][0]=n;
	m[0][1]=p;
	m[1][0]=p;
	m[1][1]=r;
	d[0][0]=q;
	d[1][0]=s;
	//NOW CALCULATING THE VALUES OF A AND B
	double a=((d[0][0]*m[1][1])-(m[0][1]*d[1][0]));
	double b=((m[0][0]*m[1][1])-(m[0][1]*m[1][0]));
	double c=((m[0][0]*d[1][0])-(d[0][0]*m[1][0]));
	double e=((m[0][0]*m[1][1])-(m[0][1]*m[1][0]));
	double x=(double)Math.round((a/b)*100)/100;
	double y=(double)Math.round((c/e)*1000)/1000;
	System.out.println(x+"\t"+y);
	System.out.println("The equation is:y'=14.81-0.61x and calculating y when x=140,150,160");
	for(int i=140;i<170;i=i+10)
		{
			calc(i,x,y);
		}
System.out.println();
	}
	static void findClass(int p[],int q[])
	{
		double z[]=new double[10];
		double z1[]=new double[10];
		int z2[]=new int[10];
		int z3[]=new int[10];
		for(int i=0;i<10;i++)
		{
			z[i]=14.81+(0.61*p[i]);
			z1[i]=q[i]-z[i];
		}
		
		for(int i=0;i<10;i++)
		{
			if(z1[i]>0)
			{
			z2[i]=i+1;
			System.out.println("class-1 value:"+z2[i]);
			}
			else
			{
			z3[i]=i+1;
			System.out.println("class-2 value:"+z3[i]);
			}
		}
		
	
	}
	static void calc(int x,double a,double c)
	{
		double y1=a+(c*x);
		System.out.println("The Values of y when x is"+x+"\t"+y1);
		return;
	}

}
