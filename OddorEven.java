package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class OddorEven {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(21);
		a.add(30);
		a.add(41);
		for(int i=0;i<a.size();i++) {
			if(a.get(i)%2==0) {
				System.out.println(a.get(i)+"is Even");
			}
			else {
				System.out.println(a.get(i)+"is Odd");
			}
	
		}
		
	}

}
