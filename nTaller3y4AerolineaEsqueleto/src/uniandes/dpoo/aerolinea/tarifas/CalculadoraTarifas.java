package uniandes.dpoo.aerolinea.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
    static double IMPUESTO = 0.10; 

    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
        int costoBase = calcularCostoBase(vuelo, cliente);
        int impuestos = calcularValorImpuestos(costoBase);
        return costoBase + impuestos;
    }

 
    protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);

   
    protected abstract double calcularPorcentajeDescuento(Cliente cliente);


    protected int calcularDistanciaVuelo(Ruta ruta) {
        
        return -1;
    }

    protected int calcularValorImpuestos(int costoBase) {
        return (int) (costoBase * IMPUESTO);
    }
}
