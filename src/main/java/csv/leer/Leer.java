package csv.leer;

import com.opencsv.CSVReader;
import dto.ArchivoCSV;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
	static void csv(File csv) throws IOException {
		System.out.println("path: " + csv.getPath());
		CSVReader csvReader = new CSVReader(new FileReader(csv.getPath()));
		String[] fila = null;
		while ((fila = csvReader.readNext()) != null) {
			System.out.println(fila[0]
					+ " | " + fila[1]
					+ " |  " + fila[2]);
		}
	}

	public static void main(String[] args) throws IOException {
		ArchivoCSV archivoCSV = new ArchivoCSV();
		System.out.println(archivoCSV.getCarpeta().getContenido());
		File[] arc = archivoCSV.getCsv();
		csv(arc[0]);
	}
}