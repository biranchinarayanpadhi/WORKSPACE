import java.util.*;
class leftR
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack();
		int n=sc.nextInt();
		int r=sc.nextInt();
		int arr[]=new int[n];
		int temp[]=new int[r];
		int i,c;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=r-1;i>=0;i--)
		{
			st.push(arr[i]);
		}
		for(i=arr.length-1,c=n-r;c!=0;i--,c--)
		{
			if(c!=0)
			{
			st.push(arr[i]);
			}
		}
		for (i=0;i<arr.length;i++)
		{
			System.out.print(st.pop()+" ");
		}
	}
}
