
import DynamicEnum.EnumElement;

public class ListFilms implements EnumElement {

    public ListFilms() {
    }

    @Override
    public Object doWith(Object args) {
        EnumElement op=(EnumElement) args;
        System.out.println(op.name());
        return (Boolean)false;    }
    
}
