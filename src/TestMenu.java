
import MenuSimple.MenuSimple;
import MenusAplicacion.OutroMenuSimple;
import MenuPrincipal.MenuPrincipal;
import menu.Menu;

/**
 * Programa de Demostración do Menu. Como vemos podemos instanciar o Menu
 * de dous xeitos, indicando as opcións na construcción, ou engadíndoas 
 * posteriormente (Ver Menu.java).
 * 
 * Amosa tres modos distintos de construír menús utilizando a clase definida
 * en Menu.java, que fai uso de DynamicEnum.
 * 
 * Nun caso real, un menú pode mezclar os tres tipos de xestión das opcións.
 * 
 */
public class TestMenu {
    public static void main(String[] args) {
        Menu menu=new Menu("Menu Principal\n==============",MenuPrincipal.class);
        menu.run();
        
        menu.setTitle("Menu Simple\n===========");
        menu.setOptions(MenuSimple.class);
        menu.run();
        
        menu.setTitle("Outro Menu Simple\n================");
        menu.setOptions(OutroMenuSimple.class);
        menu.run();
    }
}
