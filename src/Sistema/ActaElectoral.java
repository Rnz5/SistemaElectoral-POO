/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;


public class ActaElectoral extends Entidad
{
   private String titulo;
    private String fecha;
    private String hora;
    private String lugar;
    private int idMesa;
    private MesaElectoral mesa;
    private MiembrosMesa[] miembrosMesa;
    private ResultadoVoto resultados;
    private int votosBlanco;
    private int votosNulo;
    private String obs;
    private String firmas;
    private String sello;
    private int nActa;

    public ActaElectoral(String titulo, String fecha, String hora, String lugar, int idMesa, MesaElectoral mesa, MiembrosMesa[] miembrosMesa, ResultadoVoto resultados, int votosBlanco, int votosNulo, String obs, String firmas, String sello, int nActa, String ID) {
        super(ID);
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.idMesa = idMesa;
        this.mesa = mesa;
        this.miembrosMesa = miembrosMesa;
        this.resultados = resultados;
        this.votosBlanco = votosBlanco;
        this.votosNulo = votosNulo;
        this.obs = obs;
        this.firmas = firmas;
        this.sello = sello;
        this.nActa = nActa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    public MiembrosMesa[] getMiembrosMesa() {
        return miembrosMesa;
    }

    public void setMiembrosMesa(MiembrosMesa[] miembrosMesa) {
        this.miembrosMesa = miembrosMesa;
    }

    public ResultadoVoto getResultados() {
        return resultados;
    }

    public void setResultados(ResultadoVoto resultados) {
        this.resultados = resultados;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }

    public int getVotosNulo() {
        return votosNulo;
    }

    public void setVotosNulo(int votosNulo) {
        this.votosNulo = votosNulo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getFirmas() {
        return firmas;
    }

    public void setFirmas(String firmas) {
        this.firmas = firmas;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public int getnActa() {
        return nActa;
    }

    public void setnActa(int nActa) {
        this.nActa = nActa;
    }
    
    public boolean validarDatos() {
        return titulo != null && !titulo.isEmpty() &&
               fecha != null && hora != null && lugar != null;
    }
}

