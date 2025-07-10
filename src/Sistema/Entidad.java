/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class Entidad 
{
    protected String ID;

    public Entidad(String ID) {
        this.ID = ID;
    }

    public Entidad() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public boolean validarDatos()
    {
        return true;
    }
    
}

