package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class Add {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		//a.add(1,50);
		//a.set(2,70);
		a.remove(3);
		System.out.println(a);
		
	}

}
