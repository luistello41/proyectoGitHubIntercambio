package luisTelloPernas_proyectoGit;
import java.util.concurrent.TimeUnit;

public class MyName {

	public static void main(String []args) {
		
	System.out.println("\n");
		System.out.println("¿COMO TE LLAMAS?");
	
	int cont1=0;
	while(cont1!=60) {
		try {
			TimeUnit.MILLISECONDS.sleep(cont1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	System.out.print("*");
	cont1++;
     }
System.out.println("\n");
System.out.println("HOLA, ME LLAMO  ''LUIS TELLO PERNAS''");
}

}

