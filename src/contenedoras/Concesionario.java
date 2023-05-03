package contenedoras;

import models.Vehiculo;
import models.Yate;

import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Yate> yates;

    public Concesionario() {
        this.vehiculos = new ArrayList<>();
        this.yates = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo nuevoVehiculo){
        vehiculos.add(nuevoVehiculo);
    }

    public void addYate(Yate nuevoYates){
        yates.add(nuevoYates);
    }

    public Vehiculo buscarPatente(String patente){
        int i=0;
        Vehiculo encontrado=null;
        while(i< vehiculos.size()&&encontrado==null){
            if(vehiculos.get(i).getPatente().equalsIgnoreCase(patente)){
                encontrado = vehiculos.get(i);
            }else{
                i++;
            }
        }
        return encontrado;
    }

    public int contarVehiculos(){
        int i=0;
        for(Vehiculo vehiculo:vehiculos){
            i++;
        }
        return i;
    }

    public String listarVehiculos(){
        String lista = "No hay vehiculos";
        if(!vehiculos.isEmpty()){
            lista="";
            for(Vehiculo vehiculo:vehiculos){
                lista+=vehiculo.toString()+"\n";
            }
        }
        return lista;
    }

    public void eliminarPorPatente(String patente){
        Vehiculo encontrado=null;
        encontrado=buscarPatente(patente);
        if(encontrado!=null){
            vehiculos.remove(encontrado);
        }
    }

}
