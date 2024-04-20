public abstract class Caracteristicas {
    String descripcion;
    String precio;
    String nombre;
    String modelo;


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Caracteristicas() {}

    public Caracteristicas(String descripcion, String precio, String nombre, String modelo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
        this.modelo = modelo;
    }


    Caracteristicas caracteristicas(Caracteristicas specs){
        specs.descripcion = descripcion;
        specs.modelo = modelo;
        specs.nombre = nombre;
        specs.precio = precio;
        return specs;
    }
}






