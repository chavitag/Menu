
import DynamicEnum.EnumElement;
import Menu.Utils;
import java.util.Calendar;


public class SaveFilm implements EnumElement {

    public SaveFilm() {
    }

    @Override
    public Object doWith(Object args) {
        int codigo;
        String titulo;
        String director;
        Calendar data;
        String sinopse;
        Film film;
        /*OpcionesAplicacion op=(OpcionesAplicacion) args;
        switch(op) {
            case ALTAFILM:
                System.out.println("SI, soy altafilm");
        }*/
        try {
            System.out.println("ALTA DE FILM\n===========\n");
            codigo=Utils.getInt("Código: ",1,1999999999);
            titulo=Utils.getString("Titulo: ");
            director=Utils.getString("Director: ");
            data=Utils.getData("Data do Film: ");
            sinopse=Utils.getString("Resumo: ");
            film=new Film(codigo,titulo,director,sinopse,data);
            database.save(film);
        } catch(Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        return (Boolean)false;
    }
    
}
