package sistemaregistrogaudi.arte;

import sistemaregistrogaudi.vendor.Sala;

/**
 *
 * @author adrian king
 */
public class Arte {

    private Autor autor;
    private Tecnica tecnica;
    private Genero genero;

    private int year;
    private String nombreObra;
    private SizeArte tamano;
    private Sala ubicacion;
    private int id;

    public Arte() {
    }

    /**
     *
     * @param autor
     * @param tecnica
     * @param genero
     * @param year
     * @param nombreObra
     * @param tamano
     * @param ubicacion es los detos del museo;;
     * @param id
     */
    public Arte(Autor autor, Tecnica tecnica, Genero genero, int year, String nombreObra, SizeArte tamano, Sala ubicacion, int id) {
        this.autor = autor;
        this.tecnica = tecnica;
        this.genero = genero;
        this.year = year;
        this.nombreObra = nombreObra;
        this.tamano = tamano;
        this.ubicacion = ubicacion;
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public SizeArte getTamano() {
        return tamano;
    }

    public void setTamano(SizeArte tamano) {
        this.tamano = tamano;
    }

    public Sala getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Sala ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Arte{" + "autor=" + autor + ", tecnica=" + tecnica + ", genero=" + genero + ", year=" + year + ", nombreObra=" + nombreObra + ", tamano=" + tamano + ", ubicacion=" + ubicacion + ", id=" + id + '}';
    }

}
