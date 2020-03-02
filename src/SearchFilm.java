
import DynamicEnum.EnumElement;


public class SearchFilm implements EnumElement {

    public SearchFilm() {
    }

    @Override
    public Object doWith(Object args) {
        EnumElement op=(EnumElement) args;
        System.out.println(op.name());
        return (Boolean)false;
    }
}
