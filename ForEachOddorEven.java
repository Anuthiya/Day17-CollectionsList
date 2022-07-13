package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class ForEachOddorEven {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(21);
		a.add(30);
		a.add(41);
	
		a.forEach((x)-> {
			if(x%2==0) {
				System.out.println(x+"Even");
			}
			else {
				System.out.println(x+"Odd");
			}
		}
		);
}
}


