import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String origen = "M2_T02_Origen.txt";
		String Destino = "M2_T02_Destino.txt";
		
		try(FileReader fr = new FileReader(origen);
			FileWriter fw = new FileWriter(Destino);) {
			
			int caracter;
			while((caracter = fr.read()) != -1) {
				if(caracter == ' ') {
					fw.write('-');
				}else
					fw.write(caracter);
			}
		} catch (IOException e) {
			System.out.println("Se ha producido un error: "+e.getMessage());
		}
	}
}
