
import DynamicEnum.EnumElement;
import Menu.OptionElement;

public enum OpcionesAplicacion implements OptionElement {
    ALTAFILM("1.- Gardar Film",new SaveFilm()),
    CONSULTAFILM("2.- Consultar Film",new SearchFilm()),
    LISTADOFILMS("3.- Listar Films",new ListFilms()),
    SAIR("4.- Sair");

    private final String title;
    private final EnumElement option;
        
    OpcionesAplicacion(String title) {
        this.title=title;
        this.option=null;
    }    
    
    OpcionesAplicacion(String title,EnumElement option) {
        this.title=title;
        this.option=option;
    }
    
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Boolean doOption(EnumElement op) {
        if (option!=null) return (Boolean)option.doWith(op);
        return true;
    }
}
