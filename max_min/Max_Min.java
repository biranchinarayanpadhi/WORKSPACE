import java.util.*;
class Max_Min
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=5;
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort(arr);
		
	}

	
static void sort(int arr[])
	{
		int min,c=0,d=0;
		long sum=0,sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
			{
				min=arr[j];
				arr[j]=arr[i];
				arr[i]=min;
			}
			
			}
		}

		for(int i=0;i<arr.length;i++)
		{
			c++;
			sum=sum+arr[i];
			if(c==4)
			break;
		}

		for(int i=arr.length-1;i>=0;i--)
		{
			d++;
			sum1=sum1+arr[i];
			if(d==4)
			break;
		}
		System.out.print(sum+"\t");
		System.out.print(sum1);
	}



}
