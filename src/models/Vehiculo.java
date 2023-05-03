package models;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private Integer consumoCombustible;
    private Integer cantRuedas;
    private Double precio;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, Integer consumoCombustible, Integer cantRuedas, Double precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumoCombustible = consumoCombustible;
        this.cantRuedas = cantRuedas;
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(Integer consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public Integer getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(Integer cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumoCombustible=" + consumoCombustible +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                '}';
    }
}
