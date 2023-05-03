package models;

public class Auto extends Vehiculo{
    private String listaPrestaciones;
    private String modoCambios;

    public Auto() {
    }

    public Auto(String patente, String marca, String modelo, Integer consumoCombustible, Integer cantRuedas, Double precio, String listaPrestaciones, String modoCambios) {
        super(patente, marca, modelo, consumoCombustible, cantRuedas, precio);
        this.listaPrestaciones = listaPrestaciones;
        this.modoCambios = modoCambios;
    }

    public String getListaPrestaciones() {
        return listaPrestaciones;
    }

    public void setListaPrestaciones(String listaPrestaciones) {
        this.listaPrestaciones = listaPrestaciones;
    }

    public String getModoCambios() {
        return modoCambios;
    }

    public void setModoCambios(String modoCambios) {
        this.modoCambios = modoCambios;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "listaPrestaciones='" + listaPrestaciones + '\'' +
                ", modoCambios='" + modoCambios + '\'' +
                "} " + super.toString();
    }
}
