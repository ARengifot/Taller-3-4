package uniandes.dpoo.aerolinea.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {
    protected int COSTO_POR_KM; 

    
    public CalculadoraTarifasTemporadaAlta(int costoPorKm) {
        this.COSTO_POR_KM = costoPorKm;
    }

   
    @Override
    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        int distancia = calcularDistanciaVuelo(vuelo.getRuta());
        return COSTO_POR_KM * distancia;
    }

    
    @Override
    public double calcularPorcentajeDescuento(Cliente cliente) {
        return 0.0; 
    }
}
