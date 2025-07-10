/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class Candidato extends Persona
{
    private PartidoPolitico partido;

    public Candidato(PartidoPolitico partido, String nombre, String apellido, int DNI) {
        super(nombre, apellido, DNI);
        this.partido = partido;
    }

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }    
}
