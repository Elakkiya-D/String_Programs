import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		HashSet<Character> set1 = new HashSet<>(); 
		for(char arr1:str1.toCharArray()){
		    set1.add(arr1);
		}
		for(char arr2:str2.toCharArray()){
		    set1.add(arr2);
		}
		System.out.println(set1.size());
		
	}
}
