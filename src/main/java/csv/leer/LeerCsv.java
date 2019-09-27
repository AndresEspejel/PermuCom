package csv.leer;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class LeerCsv {
    String archivoCsv  = "D:\\DOCUMENTOS\\PROYECTOS\\PermuCom\\src\\main\\resources\\csv\\input\\ejemplo.csv";
    public void leerCompleto () throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader(archivoCsv));
        String[] fila = null;
        while((fila = csvReader.readNext()) != null) {
            System.out.println(fila[0]
                    + " | " + fila[1]
                    + " |  " + fila[2]);
        }
    }

    public static void main(String[] args) {
       LeerCsv leerCsv = new LeerCsv();
        try {
            leerCsv.leerCompleto();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}