/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class PartidoPolitico extends Entidad
{
    private String nombre;
    private String sigla;
    private String logo;
    private String represen;

    public PartidoPolitico(String nombre, String sigla, String logo, String represen, String ID) {
        super(ID);
        this.nombre = nombre;
        this.sigla = sigla;
        this.logo = logo;
        this.represen = represen;
    }

    public PartidoPolitico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresen() {
        return represen;
    }

    public void setRepresen(String represen) {
        this.represen = represen;
    }
    
     public boolean validarDatos() {
        return nombre != null && !nombre.isEmpty() &&
               sigla != null && !sigla.isEmpty() &&
               represen != null && !represen.isEmpty();
     }
}
