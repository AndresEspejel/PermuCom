package ejemplo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestAll {

    @Test
    public void TestSaludo(){
        HolaJava holaJava = new HolaJava();
        assertEquals("Hola, Mundo! (en Java)", holaJava.saludar("Mundo"));
    }
}
