
import Menu.OptionElement;

public class OpcionConsultar implements OptionElement {

    public OpcionConsultar() {
    }

    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean doOption(OptionElement op) {
        System.out.println("Opción de Consultas");
        return false;
    }
    
}
