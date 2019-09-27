package ejemplo;
/**
 * Clase de prueba
 * @author 1tzC0d3
 */
public class HolaJava {
    /**
     * Devuelve  un saludo a la persona que se indique
     * @param quien La persona a quien va a saludar 
     * @return una cadena saludanado a la persona indicada 
     */
public String saludar(String quien){
    return String.format("Hola, %s! (en Java)", quien);
  }
}
