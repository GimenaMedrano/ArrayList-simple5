package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ClsEjercico6 {
private String nombre;
private double sueldo;
private double descuentos;
private double sueldo_neto;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_neto() {
        return sueldo_neto;
    }

   private void  ejercicio(){
        ClsEjercico6 ej= new ClsEjercico6();
        List<ClsEjercico6>list =new ArrayList<>();
        ej.setNombre("juan");
        ej.sueldo_neto(3500);
        ej.setDescuentos(500);

       int tarea_numero = 0;
       for (TaskList tl : task) {
           if (!tl.getIsDone()) {
               System.out.println("Tarea: "+tl.getTaskName());
               System.out.println("Descripcion: "+tl.getTaskDescription());
               System.out.println("Estado: "+tl.getIsDone());
           }
           tarea_numero++;
       }
   }


}