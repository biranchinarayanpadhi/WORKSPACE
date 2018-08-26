import java.util.*;
class Solution 
{
	public static void main(String[] args) 
	{
		Integer a[]={1,2,3,2,3,2,6,5,5,4,3,1,2,3,4,5,6,7,8,9,0,12,13};
		ArrayList<Integer> list1=new ArrayList<Integer>();
		Collections.addAll(list1,a);
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=a.length;i++){
			list.add(i);
		}
		list.removeAll(list1);
		System.out.println(list);
	}
}
