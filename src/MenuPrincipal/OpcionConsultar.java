package MenuPrincipal;


import menu.OptionElement;

/**
 * Clase que se encarga de xestionar a Opción Consultar do Menú Principal.
 */
class OpcionConsultar implements OptionElement <MenuPrincipal> {
    /**
     * Comportamento de Consultar. Recibe o OptionElement por si queremos
     * xestionar varios elementos do menú con este método.
     */
    @Override
    public Boolean doOption(MenuPrincipal op) {
        System.out.println("Opción de Consultar");
        return false;
    }    
}
