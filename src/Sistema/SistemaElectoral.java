/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class SistemaElectoral implements GeneradorInforme 
{
    private Eleccion[] elecciones;
    private MesaElectoral[] mesas;
    private Candidato[] candidatos;
    private MiembrosMesa[] miembros;
    private PartidoPolitico[] partidos;

    public SistemaElectoral(Eleccion[] elecciones, MesaElectoral[] mesas, Candidato[] candidatos, MiembrosMesa[] miembros, PartidoPolitico[] partidos) {
        this.elecciones = elecciones;
        this.mesas = mesas;
        this.candidatos = candidatos;
        this.miembros = miembros;
        this.partidos = partidos;
    }

    public SistemaElectoral() {
    }

    public Eleccion[] getElecciones() {
        return elecciones;
    }

    public void setElecciones(Eleccion[] elecciones) {
        this.elecciones = elecciones;
    }

    public MesaElectoral[] getMesas() {
        return mesas;
    }

    public void setMesas(MesaElectoral[] mesas) {
        this.mesas = mesas;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }

    public MiembrosMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembrosMesa[] miembros) {
        this.miembros = miembros;
    }

    public PartidoPolitico[] getPartidos() {
        return partidos;
    }

    public void setPartidos(PartidoPolitico[] partidos) {
        this.partidos = partidos;
    }
    
    
    @Override
    public String generarInforme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}