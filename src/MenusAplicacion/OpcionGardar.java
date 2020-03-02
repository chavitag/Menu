package MenusAplicacion;


import Menu.OptionElement;

/**
 * Clase que se encarga de xestionar a Opción Gardar do Menú Principal.
 */
public class OpcionGardar implements OptionElement <MenuPrincipal> {
    /**
     * Comportamento de Gardar. Recibe o OptionElement por si queremos
     * xestionar varios elementos do menú con este método.
     */
    @Override
    public Boolean doOption(MenuPrincipal op) {
        System.out.println("Opción Gardar");
        return false;
    }   
}
