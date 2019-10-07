package dto;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class Carpeta {

	private File carpeta;
	private String path =System.getProperty("user.dir");
	private List<String> archivos = new ArrayList<>();
	private List<String> directorios = new ArrayList<>();
	Carpeta() {
		setCarpeta(new File(getPath()));
		setContenido();
	}
	Carpeta(String directorio){
		setPath(directorio);
		setCarpeta(new File(getPath()));
		setContenido();
	}

	private void setContenido() {
		File[] arch = carpeta.listFiles();
		assert arch != null;
		for (File file : arch) {
			if (file.isDirectory()) {
				setDirectorios(file.getName());
			} else {
				setArchivos(file.getName());
			}
		}
	}
	public String getPath() {
		return path;
	}

	private void setPath(String path) {
		this.path = this.path + path;
	}

	public List<String> getArchivos() {
		return archivos;
	}

	private void setArchivos(String archivos) {
		this.archivos.add(archivos);
	}

	private void setCarpeta(File carpeta) {
		this.carpeta = carpeta;
	}

	private File getCarpeta() {
		return carpeta;
	}

	public List<String> getDirectorios() {
		return directorios;
	}

	private void setDirectorios(String directorios) {
		this.directorios.add(directorios);
	}

	public String getContenido() {
		return "CARPETAS: \n"+getDirectorios() + "\n ARCHIVOS: \n" + getArchivos();
	}
	public File[] getArchivos(String extencion){
		FileFilter filtro = new FileFilter() {
			@Override
			public boolean accept(File arch) {
				return  arch.getName().endsWith(extencion);
			}
		};
		return getCarpeta().listFiles(filtro);
	}
}
