package Utilidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Inputs {
private static final Scanner SCN=new Scanner(System.in);    // Para entrada de datos
    
    /**
     * Lee de teclado un int entre min e max incluídos.
     * @param min - Valor mínimo aceptable
     * @param max - Valor máximo aceptable
     * @return  - O número enteiro lido de teclado
     * @throws Exception - A entrada non é numérica ou excede os límites
     */
    public static int getInt(int min,int max) throws Exception {
        int num;
        
        num=Integer.parseInt(SCN.nextLine());
        if ((num<min)||(num>max)) throw new Exception("Rango excedido");
        return num;
    }
    
    /**
     * lee de teclado un int
     * @return O int lido de teclado
     * @throws Exception A entrada non e un int
     */
    public static int getInt() throws Exception {
        return Integer.parseInt(SCN.nextLine());
    }
    
    /**
     * Lee de teclado un int entre min e max incluídos visualizando unha mensaxe.
     * @param txt - Mensaxe a visualizar
     * @param min - Valor mínimo aceptable
     * @param max - Valor máximo aceptable
     * @return  - O número enteiro lido de teclado
     * @throws Exception - A entrada non é numérica ou excede os límites
     */
    public static int getInt(String txt, int min, int max) throws Exception {
        System.out.print(txt);
        return getInt(min,max);
    }
    
        
    /**
     * lee de teclado un int visualizando unha mensaxe.
     * @param txt - mensaxe a visualizar
     * @return O int lido de teclado
     * @throws Exception A entrada non e un int
     */
    public static int getInt(String txt) throws Exception {
        System.out.print(txt);
        return getInt();
    }
    
    /**
     * Lee un double de teclado entre un valor mínimo e un máximo incluidos
     * @param min - límite inferior
     * @param max - límite superior
     * @return Double lido de teclado
     * @throws Exception - A entrada non é un double ou excede os límites
     */
    public static double getDouble(double min, double max) throws Exception {
        double num;
        
        num=Double.parseDouble(SCN.nextLine());
        if ((num<min)||(num>max)) throw new Exception("Rango excedido");
        return num;       
    }
    
    /**
     * Lee un Double de teclado
     * @return Double lido
     * @throws Exception  A entrada non é un Double
     */
    public static double getDouble() throws Exception {
        return Double.parseDouble(SCN.nextLine());
    }
    
          
    /**
     * Lee un double de teclado entre un valor mínimo e un máximo incluidos visualizando unha mensaxe
     * @param txt - mensaxe a visualizar
     * @param min - límite inferior
     * @param max - límite superior
     * @return Double lido de teclado
     * @throws Exception - A entrada non é un double ou excede os límites
     */
    public static double getDouble(String txt, double min, double max) throws Exception {
        System.out.print(txt);
        return getDouble(min,max);
    }
    
    /**
     * Lee un Double de teclado amosando unha mensaxe.
     * @param txt - mensaxe a visualizar
     * @return Double lido
     * @throws Exception  A entrada non é un Double
     */
    public static double getDouble(String txt) throws Exception {
        System.out.print(txt);
        return getDouble();
    }
    
    
    /**
     * Lee un String de teclado
     * @return String lido de teclado
     */
    public static String getString() {
        return SCN.nextLine();
    }
    
    /**
     * Lee un String de teclado visualizando unha mensaxe
     * @param txt - Mensaxe a visualizar
     * @return  String lido
     */
    public static String getString(String txt) {
        System.out.print(txt);
        return getString();
    }
    
    /**
     * Lee unha data do teclado
     * @param txt - Mensaxe a visualizar
     * @return Obxecto Calendar representando a data introducida
     * @throws Exception A data introducida non é correcta
     */
    public static Calendar getData(String txt) throws Exception {
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
        Date date;
        Calendar cal=Calendar.getInstance();
        
        System.out.print(txt+" (dd-mm-aaaa): ");
        String str=getString();
        date=format.parse(str);
        if (date==null) throw new Exception("Data errónea");
        //01-01-1900
        if (date.getTime()<-2208987916000L) throw new Exception("Data erróne (mín 01-01-1900)");
        //if (date.getTime() > cal.getTimeInMillis()) throw new Exception("A Data non pode ser posterior a hoxe");
        cal.setTime(date);
        return cal;
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
     * Permite elexir entre varias opcións expresadas nunha mensaxe. Con * sempre
     * se pode cancelar a entrada.
     * @param msg Mensaxe a visualizar
     * @param validas Caracteres válidos que sirven como resposta
     * @return  Caracter introducido
     */
    public static char choose(String msg,String validas) {
        char letra=0;
        char[] l;
        String str;
        do {
            try {
                System.out.print("Pulsa (*) para saír - ");
                str=getString(msg);
                l=str.toCharArray();
                if (l.length == 1) {
                    if ((l[0]=='*')||(validas.indexOf(l[0])!=-1)) letra=l[0];
                }
                if (letra==0) throw new Exception("Debes elexir entre ["+validas+"]");
            } catch(Exception e) {
                System.out.println("ERROR: "+e.getMessage());
            }
        } while(letra==0);
        return letra;
    }    
}
