public class Telefonos extends Caracteristicas implements Informacion{

    private int noSerial;
    private int chipNumero;

    public Telefonos(String nombre, String modelo, String descripcion, String precio) {
    }

    public int getNoSerial() {
        return noSerial;
    }

    public void setNoSerial(int noSerial) {
        this.noSerial = noSerial;
    }

    public int getChipNumero() {
        return chipNumero;
    }

    public void setChipNumero(int chipNumero) {
        this.chipNumero = chipNumero;
    }
    public Telefonos(String nombre, String modelo, String descripcion, String precio, int noSerial, int chipNumero) {
        super(descripcion, precio, nombre, modelo);
        this.noSerial = noSerial;
        this.chipNumero = chipNumero;
    }

    /*public Telefonos(String descripcion, float precio, String nombre, String modelo, int noSerial, int ChipNumero) {
        super(descripcion, precio, nombre, modelo);
        this.noSerial = noSerial;
        this.chipNumero = chipNumero;

    }*/

    @Override
    public String tomarPrecio() {
        return getPrecio();
    }

    @Override
    public void obtenerDescripcion() {
        System.out.println(getDescripcion());
    }
}
