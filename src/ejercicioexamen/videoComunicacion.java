package ejercicioexamen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrian Quej
 */
public class videoComunicacion {
    public String nombre;
    public int cantUsuarios;
    public int tiempo;
    public String nivel;
    public int estrellas;
    private double resultado;
    public videoComunicacion() {
    }

    public videoComunicacion(String nombre, int cantUsuarios, int tiempo, String nivel, int estrellas, double resultado) {
        this.nombre = nombre;
        this.cantUsuarios = cantUsuarios;
        this.tiempo = tiempo;
        this.nivel = nivel;
        this.estrellas = estrellas;
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantUsuarios() {
        return cantUsuarios;
    }

    public void setCantUsuarios(int cantUsuarios) {
        this.cantUsuarios = cantUsuarios;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double calidad (int valor){
        this.resultado=cantUsuarios*tiempo*estrellas;
        return resultado;
    }
    @Override
    public String toString() {
        return "videoComunicacion{" + "nombre=" + nombre + ", cantUsuarios=" + cantUsuarios + ", tiempo=" + tiempo + ", nivel=" + nivel + ", estrellas=" + estrellas + ", resultado=" + resultado + '}';
    }
    
    
    
    
   
    
}
