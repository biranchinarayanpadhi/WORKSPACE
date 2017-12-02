import java.util.*;
class Line
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,d,e,f=0;
         System.out.println("enter the size of array ");
		 a=sc.nextInt();
		int q[]=new int[a];
		for(int i=0;i<a;i++)
		{
			q[i]=sc.nextInt();
		}	
		b=stick(q,c,a);
		System.out.println(b);
		
	}
	static int stick(int q[],int c,int a)
	{	
		int d=q[0],f=0;
		int r=small(q,d,a-1);
		
			for(int i=0;i<a;i++)
		{
			f++;
			q[i]=q[i]-r;

			if(q[i]>0)
			{
								
				c++;
			}
		}
		System.out.println(f);
		a=c;
		if(c==1)
			return c;
		else
			return(stick(q,0,a));
		
	}
	static int small(int a[],int b,int c)
	{
		int d;
		if(c==-1)
		return b;
		else if(b>a[c])
		{
			b=a[c];
		}
		return(small(a,b,--c));
			
	}

}
