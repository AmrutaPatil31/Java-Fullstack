
package rto_portal;
import java.util.Scanner;
public class RTO_Portal {

	public static void main(String[] args) {
		
		EligiblityCheck e=new EligiblityCheck();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your age to check you eligiblity for Licence:");
        int age=sc.nextInt();
		
		e.checkEligiblityForLicence(age);
		
		sc.close();
	}

}

