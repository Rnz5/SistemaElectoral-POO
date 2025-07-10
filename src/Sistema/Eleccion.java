/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class Eleccion extends Entidad implements GeneradorInforme
{
    private int idEleccion;
    private String fecha;
    private String tipoEleccion;

    public Eleccion(int idEleccion, String fecha, String TipoEleccion, String ID) {
        super(ID);
        this.idEleccion = idEleccion;
        this.fecha = fecha;
        this.tipoEleccion = TipoEleccion;
    }

    public Eleccion() {
    }

    public int getIdEleccion() {
        return idEleccion;
    }

    public void setIdEleccion(int idEleccion) {
        this.idEleccion = idEleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(String TipoEleccion) {
        this.tipoEleccion = TipoEleccion;
    }
    
    public boolean validarDatos() {
        return fecha != null && !fecha.isEmpty() &&
               tipoEleccion != null && !tipoEleccion.isEmpty();
    }
    
    public String generarInforme() {
         return "Tipo de Elección: " + tipoEleccion + 
                 "\nFecha: " + fecha;
    }
}
