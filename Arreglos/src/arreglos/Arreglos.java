/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Estudiantes
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declarar
        Equipo[] equipos;
        
        //Inicializar
        equipos=new Equipo[20];
        
        //Poblar
        for(int i=0;i<20;i++){
        
        equipos[i]=new Equipo();
    }
        
        equipos[4].nombre="Patriotas";
        
        equipos[4].losFanatico[30].nombre="LA Marulis";
        equipos[4].losFanatico[31].nombre="El Paulo";
        equipos[4].losFanatico[31].nivelMarihuana=1000;
    }
    
}
