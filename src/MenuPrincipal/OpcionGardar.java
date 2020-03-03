package MenuPrincipal;


import menu.OptionRunner;

/**
 * Clase que se encarga de xestionar a Opción Gardar do Menú Principal.
 */
class OpcionGardar implements OptionRunner <MenuPrincipal> {
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
