package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class UseMarker {
	public static void main(String args[]) {
		Marker m1=new Marker("Camlin",20,"REd",true);
		Marker m2=new Marker("Faber",30,"Blue",false);
		Marker m3=new Marker("gym",40,"Yellow",true);
		Marker m4=new Marker("Renolds",50,"black",false);
		
		ArrayList<Marker> m=new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		//for(int i=0; i<m.size();i++) {
			//System.out.println(m.get(i));
			//System.out.println(m.get(i).getBrand()+" "+m.get(i).getPrice());
		//}
		//{
		//m.forEach((x)-> System.out.println(x));	
		//}
	
		//for(Marker y:m) {
			//System.out.println(y);
		//}
		//for(int i=0;i<m.size();i++) {
			//if(m.get(i).getBrand().contains("a")||m.get(i).getBrand().contains("e")||m.get(i).getBrand().contains("i")||m.get(i).getBrand().contains("o")||m.get(i).getBrand().contains("u")) {
			for(Marker y:m) {
				if(y.getBrand().contains("a")||y.getBrand().contains("o")||y.getBrand().contains("i")||y.getBrand().contains("e")||y.getBrand().contains("u")) {
					System.out.println(y.getBrand().charAt(0)+" "+y.getBrand().charAt(y.getBrand().length()-1));
				}
				else {
					System.out.println(y.getBrand().substring(1, y.getBrand().length()-1));
				}
			}
	String t="";
	for(int i=m.size()-1;i>=0;i--) {
	t=t+m.get(i).getBrand()+"*";
	}
		System.out.println(t);
		
		
	
	int total=0;
	for(Marker x:m) {
		
		total=total+x.getPrice();
	}
		System.out.println(total);
	}
		
		
}




	


