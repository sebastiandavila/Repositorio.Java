import static org.junit.Assert.assertTrue;

import org.junit.Test;
 



public class Calculadora {
    @Test
    public int SumaPositivos(int... Numeros) {
        int suma = 0;
        for (int number : Numeros) {
            if(number>0){
                suma += number;
            }
        }
        return suma;
    }
}
