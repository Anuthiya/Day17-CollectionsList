package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class EnhanCube {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		int cube=0;
		for(Integer x:a) {
			cube=x*x*x;
		
			System.out.println(cube);
			
		}
	}
}



