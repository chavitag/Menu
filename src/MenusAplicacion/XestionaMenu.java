package MenusAplicacion;


import dynamicenum.Executable;

/**
 * Clase que se encarga de xestionar OutroMenuSimple ao completo
 */
class XestionaMenu implements Executable <Boolean,OutroMenuSimple> {

    @Override
    public Boolean exec(OutroMenuSimple op) {
        switch(op) {
            case OPCION1:
                System.out.println("Son a primeira opción");
                return false;
            case OPCION2:
                return xestionaOpcion2();
            case OPCION3:
                return xestionaOpcion3();
        }
        return false;
    }

    private Boolean xestionaOpcion2() {
        System.out.println("OPCION 2: Esta opción é complexa, merece un ou varios métodos");
        return false;
    }

    private Boolean xestionaOpcion3() {
        System.out.println("OPCION 3: Esta opción tamén é complexa.....");
        return false;
    }


    
}
