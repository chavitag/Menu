
import java.util.Calendar;

class Film {
    private final int codigo;
    private String titulo;
    private String director;
    private Calendar data;
    private String sinopse;    

    public Film(int codigo, String titulo, String director, String sinopse, Calendar data) {
        this.codigo=codigo;
        this.titulo=titulo;
        this.director=director;
        this.data=data;
        this.sinopse=sinopse;
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {    
        return codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }        
}
