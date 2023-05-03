package models;

public class Yate {
    private final Integer precio = 100;
    private String modelo;

    public Yate() {
    }

    public Yate(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "precio=" + precio +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
