package utilidades;

import java.io.IOException;
import java.util.Collection;

/**
 * Console de entrada de datos e visualización
 * @version 1.0
 * @since 1.0
*/
public class Console {
    
    /**
     * Amosa en Pantalla os elementos dun ArrayList
     * @param al - ArrayList
     */
    public static void showArray(Collection al) {
        for(Object obj: al) {
            System.out.println("\t"+obj);
        }
    }  
    
    /**
     * Borra a pantalla
     */
    public final static void clearConsole() {
        System.out.println("\n\n\n");
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) Runtime.getRuntime().exec("cls");
            else                        Runtime.getRuntime().exec("clear");
        } catch (final IOException e)   {}
    }
}
