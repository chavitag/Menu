package MenuSimple;


import menu.OptionElement;

/**
 * Outro xeito de implementar un menú.
 * En lugar de instalar obxectos para xestionar cada opción, as xestionamos
 * "ao modo clásico", cun switch en "exec". So é boa idea si as opcións son
 * moi sinxelas, e incluso en ese caso, sería mellor facer un "exec" dentro de cada
 * opción do menú.
 */
public enum MenuSimple implements OptionElement <MenuSimple> {
    OPCIONA("1.- Opcion1"),
    OPCIONB("2.- Opcion2"),
    OPCIONC("3.- Opcion3");
    
    private final String title;
    
    private MenuSimple(String title) {
        this.title=title;
    }
    
    @Override 
    public String getTitle() {
        return title;
    }
    
    @Override
    public Boolean exec(MenuSimple op) {
        switch(op) {
            case OPCIONA: 
                System.out.println("Son a Opción A");
                return false;
            case OPCIONB:
                System.out.println("Son a Opcion B");
                return false;
            case OPCIONC:
                System.out.println("Son a Opcion C");
                return false;
        }
        return true;
    }
    
}
