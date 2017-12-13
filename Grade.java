import java.util.*;
class Grade
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		
		int n=sc.nextInt();
		if(n<=60)
		{
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		calculate(arr,n);
		}
	}

	static void calculate(int arr[],int n)
	{
		
		int t,b;
		
			for(int i=0;i<arr.length;i++)
		{
				if(i<100)
			{
				if(arr[i]<38)
			{
				arr[i]=arr[i];
			}
			else
			{
				b=arr[i]+5;
				for(int q=arr[i];q<b;q++)
				{
					if(q%5==0)
					{
						t=q;
						if((t-arr[i])<3)
						{
							arr[i]=t;
						}
						else
						{
						arr[i]=arr[i];
						}
					}
				}
			}
		}
	}
		display(arr,n);
}

	static void display(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
}
