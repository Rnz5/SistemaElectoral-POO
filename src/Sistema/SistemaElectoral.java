/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class SistemaElectoral implements GeneradorInforme 
{
    public Eleccion[] elecciones;
    public MesaElectoral[] mesas;
    public Candidato[] candidatos;
    public MiembrosMesa[] miembros;
    public PartidoPolitico[] partidos;
    public ActaElectoral[] actas;
    public int p_actas;
    public int p_elecciones;
    public int p_mesas;
    public int p_candidatos;
    public int p_miembros;
    public int p_partidos;

    public SistemaElectoral() {
        elecciones = new Eleccion[100];
        mesas = new MesaElectoral[100];
        candidatos = new Candidato[100];
        miembros = new MiembrosMesa[100];
        partidos = new PartidoPolitico[100];
        actas = new ActaElectoral[100];
        p_actas=0;
        p_elecciones=0;
        p_mesas=0;
        p_candidatos=0;
        p_miembros=0;
        p_partidos=0;
    }
    
    public static SistemaElectoral instancia = new SistemaElectoral();

    public ActaElectoral[] getActas() {
        return actas;
    }

    public void setActas(ActaElectoral[] actas) {
        this.actas = actas;
    }

    public int getP_actas() {
        return p_actas;
    }

    public void setP_actas(int p_actas) {
        this.p_actas = p_actas;
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

    public int getP_elecciones() {
        return p_elecciones;
    }

    public void setP_elecciones(int p_elecciones) {
        this.p_elecciones = p_elecciones;
    }

    public int getP_mesas() {
        return p_mesas;
    }

    public void setP_mesas(int p_mesas) {
        this.p_mesas = p_mesas;
    }

    public int getP_candidatos() {
        return p_candidatos;
    }

    public void setP_candidatos(int p_candidatos) {
        this.p_candidatos = p_candidatos;
    }

    public int getP_miembros() {
        return p_miembros;
    }

    public void setP_miembros(int p_miembros) {
        this.p_miembros = p_miembros;
    }

    public int getP_partidos() {
        return p_partidos;
    }

    public void setP_partidos(int p_partidos) {
        this.p_partidos = p_partidos;
    }
    
    public void IngresarPartido(PartidoPolitico p){
        if(p_partidos<=partidos.length){
            partidos[p_partidos] = p;
            p_partidos++;
        }
    }
    
    public void IngresarEleccion(Eleccion e){
        if(p_elecciones<=elecciones.length){
            elecciones[p_elecciones] = e;
            p_elecciones++;
        }
    }
    
    public void IngresarCandidato(Candidato c){
        if(p_candidatos<=candidatos.length){
            candidatos[p_candidatos] = c;
            p_candidatos++;
        }
    }
    
    public void IngresarMiembro(MiembrosMesa mm){
        if(p_miembros<=miembros.length){
            miembros[p_miembros] = mm;
            p_miembros++;
        }
    }
    
    public void IngresarMesas(MesaElectoral me){
        if(p_mesas<=mesas.length){
            mesas[p_mesas] = me;
            p_mesas++;
        }
    }
    
    public void IngresarActa(ActaElectoral ae){
        if(p_actas<=actas.length){
            actas[p_actas] = ae;
            p_actas++;
        }
    }
    
    @Override
    public String generarInforme() {
        String informe = "Informe General del Sistema Electoral: \n";
        informe = "Cantidad de Elecciones: "+p_elecciones+"\n"+
                "Cantidad de Mesas: "+p_mesas+"\n"+
                "Cantidad de Candidatos: "+p_candidatos+"\n"+
                "Cantidad de Miembros de Mesa: "+p_miembros+"\n"+
                "Cantidad de Partidos Politicos: "+p_partidos+"\n";
        return informe;
    }
    
}