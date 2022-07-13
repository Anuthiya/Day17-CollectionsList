package trainingday17COLLECTIONSlist;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int mark;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setMark(int mark) {
		this.mark=mark;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getMark() {
		return mark;
	}
	public Student(int id, String name, String gender, int mark) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.mark=mark;
	}
	public String toString() {
		return id+" "+name+" "+gender+" "+mark;
	}
}
	
		
	
