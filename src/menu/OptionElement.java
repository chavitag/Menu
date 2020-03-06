package menu;

import dynamicenum.EnumElement;
import dynamicenum.Executable;

/**
 *
 * O procesamento dos elementos do menú produce un Boolean (true saír, false continuar) 
 * e recibe un OptionElement, que sería a opción elexida
 */
public interface OptionElement <T extends OptionElement> extends EnumElement, Executable <Boolean,T> {
   
    /**
     * Os OptionElement son enum que deben ter un título que amosar no menú, 
     * Pero tamén poden ser clases que xestionan a opción, nese caso non precisan un título.
     * 
     * por eso proporcionamos UNHA IMPLEMENTACIÓN POR DEFECTO no Interface, para evitar
     * ter que implementar este método en clases que non o precisan (como OpcionConsultar no exemplo)
     * @return "" - Os enum deben ter unha implementación que devolva o titulo a visualizar, os 
     * xestores non.
     */
    public default String getTitle() {  return "";   }
    public default String name() { return ""; }
}
