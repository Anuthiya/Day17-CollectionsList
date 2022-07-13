package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class EnhanAdd {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		int total=0;
		for(Integer x:a) {
			total=x+total;
		}
			System.out.println(total);
			
		}
	}




