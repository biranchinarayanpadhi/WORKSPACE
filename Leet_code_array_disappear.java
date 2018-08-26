import java.util.*;
class Solution
{
	public static void main(String args[]){
	
	int[] a=new int[]{1,2,2,2,3,4,5,6};
	//List<Integer> final_list=findDisappearedNumbers(a);
	//System.out.println(final_list);
	HashMap map=new HashMap();
	List<Integer> n=new ArrayList<Integer>();
	for (int i=0;i<a.length;i++)
	{
		map.put(a[i],i+1);
	}
	for (int i=1;i<=a.length;i++)
	{
		if(map.get(i)==null){
		n.add(i);
		}
	}
	System.out.println(n);
	}	
}