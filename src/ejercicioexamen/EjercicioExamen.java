/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen;

/**
 *
 * @author Adrian Quej
 */
public class EjercicioExamen {
    
    private static String nombre;
    private static int cantUsuarios;
    private static int tiempo;
    private static String nivel;
    private static int estrella;

    public EjercicioExamen(String nombre, int cantUsuarios, int tiempo, String nivel, int estrella) {
        EjercicioExamen.nombre= nombre;
        EjercicioExamen.cantUsuarios= cantUsuarios;
        EjercicioExamen.tiempo= tiempo;
        EjercicioExamen.nivel= nivel;
        EjercicioExamen.estrella= estrella;
       
    }
    public static int calidad(){
     return cantUsuarios*tiempo*estrella;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        EjercicioExamen Calidad = new EjercicioExamen ("Zoom", 160, 5, "Libre",5);
        System.out.println(calidad());
        
    }
    
}
