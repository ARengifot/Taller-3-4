package uniandes.dpoo.aerolinea.modelo;



import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
    private String fecha;
    private Ruta ruta;
    private Avion avion;


    public Vuelo(String fecha, Ruta ruta, Avion avion) {
        super();
        this.fecha = fecha;
        this.ruta = ruta;
        this.avion = avion;
      
    }

    public String getFecha() {
        return fecha;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public Avion getAvion() {
        return avion;
    }

	public Collection<? extends Tiquete> getTiquetes() {
		// TODO Auto-generated method stub
		return null;
	}

	public int venderTiquetes(Cliente cliente, Object calculadoraTarifas, int cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

 
	

}
