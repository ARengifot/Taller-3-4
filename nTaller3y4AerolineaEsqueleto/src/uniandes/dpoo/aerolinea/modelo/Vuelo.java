package uniandes.dpoo.aerolinea.modelo;


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


}
