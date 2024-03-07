package uniandes.dpoo.aerolinea.tiquetes;

import java.util.Collection;

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
	public Object getVuelo() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}
	public void marcarComoUsado() {
		// TODO Auto-generated method stub
		
	}
	

}
