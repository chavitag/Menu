
import Menu.Menu;

public class TestMenu {
    public static void main(String[] args) {
        Menu menu=new Menu("Menu Principal\n==============",OpcionesAplicacion.class);
        menu.run();
    }
}
