package constructorReference;

import java.util.function.Supplier;

public class Test {
	public static void main(String[] args) {
		
		// Doctor d = new Doctor();

		Supplier<Doctor> s = Doctor::new; // constructor reference
		Doctor doctor=s.get();
		System.out.println(doctor.hashCode());
	}
}

class Doctor {
	public Doctor() {
		System.out.println("Doctor constructor..."); 
	}
} 