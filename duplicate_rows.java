import java.util.Scanner;
import java.lang.Math;
class Solution
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i=3;
		int j=3;
		int k=0,l=0,p=0,r=0;
		int a[][]= new int[i][j];
		int value[]=new int[i];
		int temp[]=new int[3];
		for (k=0;k<a.length;k++)
		{
			for(l=0;l<a[0].length;l++){
			
				a[k][l]=sc.nextInt();
			}
		}
		for (k=0;k<a.length;k++)
		{
			
			for(l=0;l<a[0].length;l++){
			
				System.out.print(a[k][l]);
			}
			System.out.println();
		}
		for (k=0;k<a.length;k++)
		{
			for(l=0;l<a[0].length;l++){
				value[p]=a[k][l];
				p++;
			}
			p=0;
			temp[r]=take_values(value);
			r++;
		}
		check_duplicate(temp);
	}
	public static int take_values(int k[]){
	
		int i,sum=0;
		for(i=0;i<k.length;i++){
			sum=sum+(int)(k[i]*(Math.pow(2,i)));
		}
		return sum;
	}
	public static void check_duplicate(int temp[]){
	int i=0,j=0,c=0,t=0;
		
		for(i=0;i<temp.length;i++){
			for(j=0;j<temp.length;j++){
				if(temp[i]==temp[j]){
					c++;
				}
			}
			temp[i]=0;
			if(c>1){
				t++;
				//break;
			}
			c=0;
		}
		System.out.println(t);
	}
	
}