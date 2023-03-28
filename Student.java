import java.util.Scanner;

class Student{
	void Play() {
		
		System.out.println("Playing Football");
		
	}
}

class Bob extends Student{
	
	void Study() {
		
		System.out.println("Studying Physics...");
		
	}
}

public class Single {
	
	public static void main(String args[]) {
		
		Bob d=new Bob();
		d.Study();
		d.Play();
		
	}
}
