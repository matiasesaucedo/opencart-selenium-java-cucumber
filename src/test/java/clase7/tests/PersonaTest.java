package clase7.tests;

import clase7.Persona;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonaTest {

    @Test
    public void validarNombre() {
        Persona persona = new Persona("Matias", "Saucedo", 30);

        Assert.assertEquals(persona.getNombre(), "Matias");
    }

    @Test
    public void validarNombreIncorrecto(){
        Persona persona = new Persona("Matias", "Saucedo", 30);

        Assert.assertNotEquals(persona.getNombre(), "Matias2");
    }
    @Test
    public void validarSaludo(){
        Persona persona = new Persona("Emanuel", "Saucedo", 30);

        Assert.assertTrue(persona.saludar().equals("Hola, soy Matías Saucedo"));
    }
}
