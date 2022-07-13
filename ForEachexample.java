package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class ForEachexample {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
	
		a.forEach((x)-> System.out.println(x));
	
}
}
