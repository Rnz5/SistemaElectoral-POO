/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class ResultadoVoto 
{
    private Candidato candidatos;
    private int votos;
    private String partido;
    
    public ResultadoVoto(String partido, int votos){
        this.partido = partido;
        this.votos = votos;
    }

    public ResultadoVoto() {
    }

    public Candidato getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato candidatos) {
        this.candidatos = candidatos;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    public void Resultados(String partido, int votos){
        
    }
    
    
}
