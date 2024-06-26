package diadia;
import java.util.Scanner;

/**
 * Classe Input/Output gestisce tutti i System.in/System.out
 * 
 * @author Diego De Martino
 * @version base 4.0
 */
public class IOConsole implements IO{
	
	Scanner scannerDiLinee;
	
	public IOConsole() {}
	
	public IOConsole(Scanner scan) {
		scannerDiLinee = scan;
	}
	
	public void mostraMessaggio(String msg) {
		System.out.println(msg);
	}
	
	public void mostraMessaggioInLinea(String msg) {
		System.out.print(msg);
	}
	
	public String leggiRiga() {
		String riga = scannerDiLinee.nextLine();
		//scannerDiLinee.close();
		return riga;
	}
}
