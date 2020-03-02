
import DynamicEnum.EnumElement;
import Menu.OptionElement;

public class OpcionGardar implements EnumElement <Boolean,OptionElement> {

    public OpcionGardar() {
    }

    @Override
    public Boolean doWith(OptionElement op) {
        System.out.println("Opción Gardar");
        return false;
    }   
}
