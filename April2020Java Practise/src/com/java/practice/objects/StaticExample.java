package com.java.practice.objects;

class Student {
	int id;
	String sname;
	static String shm="abc";

	public void show() {
		System.out.println(id + " /" + sname + " " + shm);
	}
}

public class StaticExample {
	public static void main(String[] args) {
		Student ram = new Student();
		ram.id = 101;
		ram.sname = "Mahesh";
		Student balaji = new Student();
		balaji.id = 105;
		balaji.sname = "bunny";
		Student abhinay = new Student();
		abhinay.id = 103;
		abhinay.sname = "shiva";
		Student nikil = new Student();
		nikil.id = 104;
		nikil.sname = "pawan";
		ram.show();
		balaji.show();
		abhinay.show();
		nikil.show();

	}

}
