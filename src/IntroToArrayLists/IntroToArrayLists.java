package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> words=new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("Hi");
		words.add("Bye");
		words.add("Ok");
		words.add("Yes");
		words.add("No");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < words.size(); i++) {
			String w=words.get(i);
			System.out.println(w);
		}
		//4. Print all the Strings using a for-each loop
		for (String w: words) {
			System.out.println(w);
		}
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < words.size(); i++) {
			words.get(i);
			if (i % 2==0) {
				String w=words.get(i);
						System.out.println(w);;
			}
		}
		//6. Print all the Strings in reverse order.
	for (int i = 4; i<words.size(); i--) {
		String w=words.get(i);
		System.out.println(w);
	}
		//7. Print only the Strings that have the letter 'e' in them.
	for (int i = 0; i < words.size(); i++) {
		words.get(i);
		if (words.contains("e")) {
			String w=words.get(i);
			System.out.println(w);
		}
	}
	}
}
