package MenusAplicacion;


import Menu.OptionElement;

/**
 * Outro xeito de implementar un menú.
 * En lugar de instalar obxectos para xestionar cada opción, as xestionamos
 * "ao modo clásico", cun switch en doOption. So é boa idea si as opcións son
 * moi sinxelas, e incluso en ese caso, sería mellor facer un doOption dentro de cada
 * opción do menú.
 */
public enum MenuSimple implements OptionElement<MenuSimple> {
    OPCIONA("1.- Opcion1"),
    OPCIONB("2.- Opcion2"),
    OPCIONC("3.- Opcion3"),
    SAIR("4.- Saír");
    
    private String title;
    
    private MenuSimple(String title) {
        this.title=title;
    }
    
    @Override 
    public String getTitle() {
        return title;
    }
    
    @Override
    public Boolean doOption(MenuSimple op) {
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
