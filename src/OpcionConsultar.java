
import DynamicEnum.EnumElement;
import Menu.OptionElement;

public class OpcionConsultar implements EnumElement <Boolean,OptionElement> {

    public OpcionConsultar() {
    }

    @Override
    public Boolean doWith(OptionElement op) {
        System.out.println("Opción de Consultar");
        return false;
    }    
}
