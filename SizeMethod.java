package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class SizeMethod {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
		}
			System.out.println(a.get(0)+a.get(1)+a.get(2)+a.get(3));
		}
		
	}


