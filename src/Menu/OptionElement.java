package Menu;

import DynamicEnum.EnumElement;

/**
 *
 * O procesamento dos elementos do menú produce un Boolean (true saír, false continuar) 
 * e recibe un OptionElement, que sería a opción elexida
 */
public interface OptionElement extends EnumElement <Boolean,OptionElement> {
    public String getTitle();
    
    public Boolean doOption(OptionElement op);
    
    @Override
    public default String name() {
        return getTitle();
    }
    
    @Override
    public default Boolean doWith(OptionElement el) {
        return doOption(el);
    }
}
