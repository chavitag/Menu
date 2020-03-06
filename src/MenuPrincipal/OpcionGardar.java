package MenuPrincipal;

import dynamicenum.Executable;

/**
 * Clase que se encarga de xestionar a Opción Gardar do Menú Principal.
 */
class OpcionGardar implements Executable <Boolean,MenuPrincipal> {
    /**
     * Comportamento de Gardar. Recibe o OptionElement por si queremos
     * xestionar varios elementos do menú con este método.
     */
    @Override
    public Boolean exec(MenuPrincipal op) {
        System.out.println("Opción Gardar");
        return false;
    }   
}
