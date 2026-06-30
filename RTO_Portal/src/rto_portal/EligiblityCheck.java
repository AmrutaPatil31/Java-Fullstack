
package rto_portal;



public class EligiblityCheck {
	
	void checkEligiblityForLicence(int age) {
		
		if( age < 0 && age > 110 ) {
			
			System.out.println("Enter a valid age");
			
		}
		
		if( age >= 18 && age < 75 ) {
			
			System.out.println("You are eligible for the licence");
			
		}else if( age >= 75 ) {
			
			System.out.println("You are not eligible for the licence");
			
		}else  {
			
			int waitingPeriod=18-age;
			System.out.println("wait for "+ waitingPeriod+" years for Licence");
			
		}
	}
}

