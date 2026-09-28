package modelo;

public class VideoJuego {

    private String titulo;
    private String genero;
    private double precio;

    public VideoJuego() {
        this("", "Otro", 0.0);
    }

    public VideoJuego(String titulo, String genero) {
        this(titulo, genero, 0.0);
    }

    public VideoJuego(String titulo, String genero, double precio) {
        setTitulo(titulo);
        setGenero(genero);
        setPrecio(precio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo.trim();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe seleccionar un género.");
        }
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public Object[] registrarDatos() {
        return new Object[]{titulo, genero, precio};
    }

    public Object[] registrarDatos(boolean conSimbolo) {
        if (conSimbolo) {
            return new Object[]{titulo, genero, "S/ " + String.format("%.2f", precio)};
        }
        return registrarDatos();
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ") - S/ " + precio;
    }
}