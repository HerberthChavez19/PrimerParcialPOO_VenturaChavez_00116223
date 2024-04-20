public class Laptops extends Caracteristicas implements Informacion{
    private String procesador;
    private int RAM;

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public Laptops(String nombre, String modelo, String descripcion,  String precio, String procesador, int RAM) {
        super(nombre, precio, descripcion, modelo);
        this.procesador = procesador;
        this.RAM = RAM;
    }


    @Override
    public String tomarPrecio() {
        return getPrecio();
    }

    @Override
    public void obtenerDescripcion() {
        System.out.println(getDescripcion());
    }
}