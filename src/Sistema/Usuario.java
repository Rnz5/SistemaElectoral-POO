/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class Usuario 
{
    private String user;
    private String contra;
    private String rol; 

    public Usuario(String User, String contra, String rol) {
        this.user = User;
        this.contra = contra;
        this.rol = rol;
    }

    public Usuario() {
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String User) {
        this.user = User;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public boolean login(String usuario, String contra)
    {
        return this.user.equals(usuario) && this.contra.equals(contra);
    }
    
    public boolean validarUser()
    {
        return user != null && !user.isEmpty() && contra != null && !contra.isEmpty();
    }
} 

