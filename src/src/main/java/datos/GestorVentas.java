package datos;

import modelo.Cafeteria;

import java.io.*;


public class GestorVentas {

	public static Cafeteria leerArchivoVentas(String direccionArchivo, Cafeteria cafeteria) {String textoArchivo = "";
		try {
			File archivo = new File(direccionArchivo);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			while ((textoArchivo = br.readLine()) != null) {
				String[] data = textoArchivo.split(",");
				System.out.println(textoArchivo);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("Documento no disponible, favor contactar con administrador");
		}
		return cafeteria;
	}


	public static boolean registrarDato(Object objeto, String direccionArchivo) {
		boolean lineaVacia = false;
		try {
			File file = new File(direccionArchivo);
			if (!file.exists()) {
				file.createNewFile();
				lineaVacia = true;
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			if (lineaVacia == false) {
				bw.newLine();
			}
			bw.write(objeto.toString());
			bw.close();
			fw.close();
			return true;
		} catch (Exception e) {
			System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
			return false;
		}
	}
}