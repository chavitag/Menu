package MenuPrincipal;


import dynamicenum.Executable;
import menu.OptionElement;

/**
 * Exemplo de Menu.
 * Como se pode ver, se pode programar "en liña" o comportamento da opción
 * ou delegar nun obxecto de tipo Executable que se encargue.
 * Neste caso, as opcións 1 e 2 utilizan o método "exec" dos obxectos de tipo
 * OpcionGardar e OpcionConsultar (Executable) respectivamente.
 * A opción 3 ten programado o comportamento directamente no método  "ecec", xa
 * que os OptionElement extenden Executable.
 * A opción 4 executa o "exec" definido en MenuPrincipal, pero como o atributo "option"
 * é null, devolve true finalizando o bucle do menú.
 * 
 * Este xeito de implementar menús é útil si a implementación das opcións é complexa, xa  
 * que podemos adicar unha clase a cada opción.
 */
public enum MenuPrincipal implements OptionElement <MenuPrincipal> {
    ALTAFILM("1.- Gardar Film",new OpcionGardar()),
    CONSULTAFILM("2.- Consultar Film",new OpcionConsultar()),
    LISTADOFILMS("3.- Listar Films") {
        @Override
        public Boolean exec(MenuPrincipal opcion) {
            System.out.println("Opcion Listar");
            return false;
        }
    },
    SAIR("4.- Sair");

    private final String title;         // Título do menú
    private final Executable<Boolean,MenuPrincipal> option; // Obxecto "Delegado" que levará a cabo o doOption
        
    // Constructor dos Enum definidos arriba (o usa LISTADOFILMS e SAIR)
    private MenuPrincipal(String title) {
        this.title=title;
        this.option=null;
    }    
    
    // Outro constructor (o usan ALTAFILM e CONSULTAFILM)
    private MenuPrincipal(String title,Executable<Boolean,MenuPrincipal> option) {
        this.title=title;
        this.option=option;
    }
    
    // Devolve o título a amosar no menú
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * Leva a cabo a acción da entrada do menú. 
     * Si o enum ten unha implementación, sobrepoñerá esta (LISTADOFILMS)
     * Si non temos unha clase OptionElement que se encargue de xestionar a opción
     * devolvemos true, que provoca a saída do menú
     */
    @Override
    public Boolean exec(MenuPrincipal op) {
        if (option!=null) return option.exec(op); // Si temos delegado executamos o seu doOption
        return true; // Saír
    }
}
