package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	public Tiquete(String codigo,Vuelo vuelo, Cliente clienteComprador , int tarifa) {
		super();
		this.codigo = codigo;
		this.tarifa = tarifa;

	}
	public boolean esUsado() {
		// TODO Auto-generated method stub
		return false;
	}
	public double getTarifa() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getCliente() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
