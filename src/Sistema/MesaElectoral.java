/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class MesaElectoral extends Entidad implements GeneradorInforme
{
    private String lugar;
    private String fecha;
    private String hora;
    private MiembrosMesa[] miembros;
    private ActaElectoral[] actas;
    private int p_miembros;
    private int p_acta;

    public MesaElectoral(String lugar, String fecha, String hora, String ID) {
        super(ID);
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        miembros = new MiembrosMesa[100];
        actas = new ActaElectoral[100];
        p_miembros=0;
        p_acta=0;
    }

    public int getP_miembros() {
        return p_miembros;
    }

    public void setP_miembros(int p_miembros) {
        this.p_miembros = p_miembros;
    }

    public int getP_acta() {
        return p_acta;
    }

    public void setP_acta(int p_acta) {
        this.p_acta = p_acta;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public MiembrosMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembrosMesa[] miembros) {
        this.miembros = miembros;
    }

    public ActaElectoral[] getActas() {
        return actas;
    }

    public void setActas(ActaElectoral[] actas) {
        this.actas = actas;
    }
    
    public boolean validarDatos() {
        return lugar != null && fecha != null && hora != null;
    }

    @Override
    public String generarInforme() {
        return "Mesa en " + lugar + " con " + miembros.length + " miembros.";
    }
    
    
    
}
