package logica;
import logica.Parcial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Pruebas {
    public Parcial parcial = new Parcial(); 
    @Test
    void cuadratica1() throws Exception{
        assertEquals(1, parcial.cuadratica1(3,-6,3));
        assertEquals(-1, parcial.cuadratica1(1,3,2));
        assertEquals("Si el coeficiente a es 0, automaticamente deja de ser una cuadratica", parcial.cuadratica1(0,2,3));
    }
    @Test
    void cuadratica2()throws Exception{
        assertEquals(-2, parcial.cuadratica2(1,3,2));
    }
}

/*Desarrolle una suite de pruebas para el ejercicio del punto 1 que asegure 100% de cobertura de la clase Parcial

Incluya la suite en el mismo proyecto en repositorio GIT del punto 1 */