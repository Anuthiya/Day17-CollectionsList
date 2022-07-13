package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class TotalArrList {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(21);
		a.add(30);
		a.add(41);
		int total=0;
		for(int i=0;i<a.size();i++) {
			total=a.get(i)+total;
		}
			System.out.println(total);
		}
			
	
		}
		
	




