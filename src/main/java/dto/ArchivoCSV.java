package dto;

import java.io.File;

public class ArchivoCSV {
	private Carpeta carpeta;

	private File[] csv;

	public ArchivoCSV() {
		carpeta = new Carpeta("\\csv\\input");
		buscarCSV();
	}

	private void buscarCSV() {
		setCsv(carpeta.getArchivos(".csv"));
		System.out.println("Files: " + csv.length);
	}

	public Carpeta getCarpeta() {
		return carpeta;
	}

	public File[] getCsv() {
		return csv;
	}

	private void setCsv(File[] csv) {
		this.csv = csv;
	}
}
