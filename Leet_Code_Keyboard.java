import java.util.*;
class Solution
{
		static Character row1[]={'Q','W','E','R','T','Y','U','I','O','P','q','w','e','r','t','y','u','i','o','p'};
		static Character row2[]={'A','S','D','F','G','H','I','J','K','L','a','s','d','f','g','h','j','k','l'};
		static Character row3[]={'Z','X','C','V','B','N','M','z','x','c','v','b','n','m'};

		static List<Character> list1=new ArrayList<Character>(Arrays.asList(row1));
		static List<Character> list2=new ArrayList<Character>(Arrays.asList(row2));
		static List<Character> list3=new ArrayList<Character>(Arrays.asList(row3));
	
	public static ArrayList<String> match_words(ArrayList<String> words){
		ArrayList<String> result_list=new ArrayList<String>();
		for(int i=0;i<words.size();i++){
			String word=words.get(i);
			if(check_for_the_rows(word)){
				result_list.add(word);
			}
		}
		/*if(result_list.isEmpty()){
		System.out.println("No Words matched");
		}*/
		//else{
			return result_list;
		//}
	}
	public static boolean check_for_the_rows(String word){
		boolean find_row1=false;
		boolean find_row2=false;
		boolean find_row3=false;
		for(int i=0;i<word.length();i++){
			char current_letter=word.charAt(i);
			if(list1.contains(current_letter)){
			find_row1=true;
			//continue;
			}
			else if(list2.contains(current_letter)){
			find_row2=true;
			//continue;
			}
			else if(list3.contains(current_letter)){
			find_row3=true;
			continue;
			}
			else{
			continue;
			}
		}
		int letter_in_row=0;
		if(find_row1){
				letter_in_row++;
		}
		if(find_row2){
				letter_in_row++;
		}
		if(find_row3){
				letter_in_row++;
		}

		if(letter_in_row==1){
			//System.out.println(find_row1+" "+find_row2+" "+find_row3);
		    return true;
		}
		else{
			return false;
		}
	}
}
class LeetCode
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no_of_words you want to enter:");
		int n=sc.nextInt();
		ArrayList<String> words=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			words.add(sc.next());
		}
		Solution s = new Solution();
		System.out.println(s.match_words(words));
		
	}
	
}
