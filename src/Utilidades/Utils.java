package Utilidades;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Utils de entrada de datos e visualización
 * @version 1.0
 * @since 1.0
*/
public class Utils {
    
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
    
    /**
     * Engade un Array de bytes a unha Collection de Bytes. Útil para concatenar
     * varios campos nun único array de bytes.
     *
     * @param data Collection de Bytes onde se concatenarán os obxectos
     * serializados
     * @param info Array de bytes a concatenar
     */
    public static void addAll(Collection<Byte> data, byte[] info) {
        for (Byte b : info) {
            data.add(b);
        }
    }

    /**
     * Devolve un array de byte almacenados nunha Collection de Bytes
     *
     * @param c Collection de Obxectos Byte
     * @return Array de bytes cos bytes almacenados na Collection
     */
    public static byte[] getByteArray(Collection<Byte> c) {
        byte[] array = new byte[c.size()];
        int idx = 0;
        for (Byte b : c) {
            array[idx] = b;
            idx++;
        }
        return array;
    }
    
    /**
     * Devolve un obxecto da clase "type" chamando ao constructor por defecto
     * @param <T> Tipo de variable ao que asignamos a instancia devolta. Así aseguramos
     * que a variable á que asignamos a instancia coincide co tipo da Clase que pasamos
     * como argumento:
     * 
     * 
     * Exemplo:
     *  Libro lib=getInstance(Libro.getClass());  -> Correcto
     *  Socio soc=getInstance(Socio.getClass());  -> Erro DE COMPILACION.
     * 
     * @param type Clase da que desexamos un obxecto
     * @return Obxecto da clase type
     * @throws IllegalArgumentException  Non se conseguiu crear o obxecto. O máis
     * común é porque a clase non ten un constructor por defecto.
     */
     public static <T> T getInstance(Class<T> type) {
        try {
            if (type!=null) return type.getDeclaredConstructor().newInstance();
            return null;
        } catch (NoSuchMethodException | SecurityException | InstantiationException 
                | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new IllegalArgumentException(ex.getMessage()+" (And Must have a default constructor)");
        }    
    }
}
