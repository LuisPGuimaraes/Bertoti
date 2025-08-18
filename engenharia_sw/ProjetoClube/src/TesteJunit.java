import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;


public class TesteJunit {

    @Test
    public void test(){

        Socio numerosocio = new Socio("Fernando", new SimpleDateFormat("12-12-2023"), "Basico", 0001);

        assertEquals(numerosocio.getNome().compareTo("Ferenando"));
    }
}
