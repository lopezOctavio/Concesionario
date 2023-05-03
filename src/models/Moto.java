package models;

public class Moto extends Vehiculo{
    private Integer cilindrada;
    private Boolean tieneBaul;

    public Moto() {
    }

    public Moto(String patente, String marca, String modelo, Integer consumoCombustible, Integer cantRuedas, Double precio, Integer cilindrada, Boolean tieneBaul) {
        super(patente, marca, modelo, consumoCombustible, cantRuedas, precio);
        this.cilindrada = cilindrada;
        this.tieneBaul = tieneBaul;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Boolean getTieneBaul() {
        return tieneBaul;
    }

    public void setTieneBaul(Boolean tieneBaul) {
        this.tieneBaul = tieneBaul;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", tieneBaul=" + tieneBaul +
                '}';
    }
}
