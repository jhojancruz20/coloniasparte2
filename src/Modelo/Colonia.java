package Modelo;
import java.util.ArrayList;
import java.util.List;


public class Colonia {
    private String nombre, platoTipico, municipio;
    private List<Colonia> colonias;

    public Colonia() {
    }

    public Colonia(String nombre, String platoTipico, String municipio, List<Colonia> colonias) {
        this.nombre = nombre;
        this.platoTipico = platoTipico;
        this.municipio = municipio;
        colonias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlatoTipico() {
        return platoTipico;
    }

    public void setPlatoTipico(String platoTipico) {
        this.platoTipico = platoTipico;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public List<Colonia> getColonias() {
        return colonias;
    }

    public void setColonias(List<Colonia> colonias) {
        this.colonias = colonias;
    }
    
    
    public Colonia buscarColoniaPorNombre(String nombre) {
        for (Colonia colonia : colonias) {
            if (colonia.getNombre() == nombre) {
                return colonia;
            }
        }
        return null;
    }
    
}
