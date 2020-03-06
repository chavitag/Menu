/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author xavi
 */
public class DataManage {
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
     * Devolve un obxecto Calendar representando unha data en forma de String.
     * @param c
     * @return 
     */
    public static String strData(Calendar c) {
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        return format.format(c.getTime());
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
    /*public static <T> T getInstance(Class<T> type) {
        try {
            if (type!=null) return type.getDeclaredConstructor().newInstance();
            return null;
        } catch (NoSuchMethodException | SecurityException | InstantiationException 
                | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            throw new IllegalArgumentException(ex.getMessage()+" (And Must have a default constructor)");
        }    
    }*/
     
    public static byte[] longToBytes(long number,int sz) {
        byte[] dest=new byte[sz];
        long pot=0xFF;
        int add=0;
        for(int i=sz;i>0;i--) {
            dest[i-1]=(byte)((number&pot)>>add);
            pot<<=8;
            add+=8;
        } 
        return dest;
    }
     
    public static long bytesToLong(byte[] bytes,int pos,int sz) {
        long number=0;
        long pot; 
        int add;
        
        add=0;
        pot=0xFF;
        while(sz>0) {
            number+=((long)bytes[pos+sz-1]<<add)&pot;
            add+=8;
            pot<<=8;
            sz--;
        }
        return number;
    }
    
    // Redimensiona (Recorta ou amplía...) un String á lonxitude len
/*    public static String resizeString(String str,int len) {
        byte[] bytes=OSerial.serialize(str,len);
        return new String(bytes);
    }
*/    
    public static String resizeString(String str,int width) {
        return str.substring(0,Math.min(width, str.length()));
    }
    
    
    public static Collection <Byte> addBytesToList(Collection <Byte> c,byte[] bytes) {
        for(byte b: bytes) {
            c.add(b);
        }
        return c;
    }
}
