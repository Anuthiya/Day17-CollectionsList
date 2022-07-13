package trainingday17COLLECTIONSlist;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String args[]) {
		Student s1 = new Student(100, "ABCD", "Male", 95);
		Student s2 = new Student(103, "EFDG", "Female", 97);
		Student s3 = new Student(105, "QWER", "male", 98);
		Student s4 = new Student(108, "GJSHF", "Female", 94);

		ArrayList<Student> s = new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);

		ArrayList<Student> female = new ArrayList<>();

		for (Student x : s) {
			if (x.getGender().equals("Female")) {
				female.add(x);

			}
		}
		System.out.println(female);

	}

}
