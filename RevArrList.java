package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class RevArrList {
	public static void main(String args[]) {
		ArrayList<String> a = new ArrayList<>();
		a.add("six");
		a.add("seven");
		a.add("eight");
		a.add("nine");
		a.add("seventeen");
		a.add("sixteen");
		a.add("sonia");
		a.add("Surya");
		a.add("one");
		a.add("sathya");
		a.add("stwo");
		
		ArrayList<String> as = new ArrayList<>();
		
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).startsWith("s")) {
				as.add(a.get(i));
			}
		}
				System.out.println(as);

			}
		}
	

