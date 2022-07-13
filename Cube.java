package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class Cube {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(21);
		a.add(30);
		a.add(41);
		int cube=0;
		for(int i=0;i<a.size();i++) {
			//total=a.get(0)*a.get(0)*a.get(0);
			cube=a.get(i)*a.get(i)*a.get(i);
		}
			System.out.println(cube);
		}
			
	
		}
		


