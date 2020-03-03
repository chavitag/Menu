
import MenuSimple.MenuSimple;
import MenusAplicacion.OutroMenuSimple;
import MenuPrincipal.MenuPrincipal;
import menu.Menu;
import menu.OptionElement;

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

        menu.addOption("VAYA","4.- Vaya vaya...",new OptionElement<OptionElement>() {
            @Override
            public Boolean doOption(OptionElement op) {
                System.out.println("Juas");
                return false;
            }
        });
        menu.addOption("SAIR","5.- Saír",null);
        menu.run();
        
        menu.setTitle("Outro Menu Simple\n================");
        menu.setOptions(OutroMenuSimple.class);
        menu.run();
    }
}
