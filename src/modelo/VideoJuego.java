package modelo;

public class VideoJuego {

    public String titulo;
    public String genero;
    public double precio;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, String genero, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Object[] RegistrarDatos() {
        Object[] fila = {titulo, genero, precio};
        return fila;
    }
    
}
