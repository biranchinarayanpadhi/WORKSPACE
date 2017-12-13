import java.util.*;
class Trees
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();
		int t=sc.nextInt();

		
		int a=sc.nextInt();
		int b=sc.nextInt();

		
		int m=sc.nextInt();
		int n=sc.nextInt();

	int app[]=new int[m];
	int orang[]=new int[n];
		
		for(int i=0;i<m;i++)
		{
			app[i]=sc.nextInt();
		}

		System.out.println("values of d for n oranges");
		for(int j=0;j<n;j++)
		{
			orang[j]=sc.nextInt();
		}
	calculate(s,t,a,b,m,n,app,orang);
	}

	static void calculate(int s,int t,int a,int b,int m,int n,int app[],int orang[])
	{
		int c=0,q=0;

		for(int i=0;i<app.length;i++)
		{
			if((a+app[i])>=s&&(a+app[i])<=t)
			{
				c++;
			}
		}
		for(int i=0;i<orang.length;i++)
		{
			if((b+orang[i])>=s&&(b+orang[i])<=t)
			{
				q++;
			}
		}

		System.out.println(c+"\t"+q);
	}
}

