/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class MiembrosMesa extends Persona
{
    private String tipo;

    public MiembrosMesa(String tipo, String nombre, String apellido, int DNI) {
        super(nombre, apellido, DNI);
        this.tipo = tipo;
    }

    public MiembrosMesa() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
