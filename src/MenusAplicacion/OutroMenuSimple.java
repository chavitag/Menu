package MenusAplicacion;


import dynamicenum.Executable;
import menu.OptionElement;

/**
 * Outro modo de implementar un menú. Unha única clase se encarga de todo.
 * So e boa idea si a implementación do menú é relativamente simple.
 * @author xavi
 */
public enum OutroMenuSimple implements OptionElement <OutroMenuSimple> {
    OPCION1("1.- Elixe esta opción",new XestionaMenu()),
    OPCION2("2.- Mellor elixe esta",new XestionaMenu()),
    OPCION3("3.- Esta é a mellor de todas",new XestionaMenu()),
    SAIR("4.- Saimos do Programa.");
    
    private final String title;
    private final Executable<Boolean,OutroMenuSimple> delegate;
    
    private OutroMenuSimple(String title) {
        this.title=title;
        this.delegate=null;
    }
    
    private OutroMenuSimple(String title,Executable<Boolean,OutroMenuSimple> delegate) {
        this.title=title;
        this.delegate=delegate;
    }
    
    @Override 
    public String getTitle() {
        return title;
    }
    
    @Override
    public Boolean exec(OutroMenuSimple op) {
        if (delegate!=null) return delegate.exec(op); // Si temos delegado executamos o seu doOption
        return true; // Saír
    }
}
