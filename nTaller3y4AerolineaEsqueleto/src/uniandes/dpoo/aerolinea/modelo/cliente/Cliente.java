package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
		
	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	public Cliente() {
	}

	public abstract String getIdentificador();
	public abstract String getTipoCliente();

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	 public int calcularValorTotalTiquetes() {
	        int valorTotal = 0;
	        for (Tiquete tiquete : tiquetesUsados) {
	            valorTotal += tiquete.getPrecio();
	        }
	        return valorTotal;
	    }

	    public void usarTiquetes(Vuelo vuelo) {
	        for (Tiquete tiquete : tiquetesSinUsar) {
	            if (tiquete.getVuelo().equals(vuelo)) {
	                tiquetesUsados.add(tiquete);
	            }
	        }
	        tiquetesSinUsar.removeAll(tiquetesUsados);
	    }

	    public void agregarTiquete(Tiquete tiquete) {
	        tiquetesSinUsar.add(tiquete);
	    }

}
