package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ClsArrayList {


        //List<String> taskList = new ArrayList<String>();
        //taskList.add("hacer compras");
        //taskList.add("pasear al perro");
        //taskList.add("hacer la cama");
        //taskList.add("ir a votar");

        //String lectura = "ir a votar";
        //taskList.add(lectura);
        //taskList.add("hacer la cama");
        //taskList.add("avar el carro");
        //taskList.add("pasear al perro");
        //taskList.add("hacer compras");

        //System.out.println("Tareas pendientes: " + taskList);
        //String primerTarea = taskList.get(0);
        //System.out.println("Primer tarea "+primerTarea);

        //remover o eliminar item
        //taskList.remove(0);
        //primerTarea = taskList.get(0);
        //System.out.println("Primer tarea "+primerTarea);

        // iterate o iteracion
        //int pos = 0;
        //for (String task : taskList) {
         //   System.out.println(pos+ "Tarea: "+task);
          //  pos++;
        //}
    }

    public void ejemplo2(){
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(500);
        numberList.add(1000);
        numberList.add(1500);
        numberList.add(2000);
        numberList.add(2500);

        int total = 0;
        for (int n : numberList) {
            total += n;
            System.out.println("Sumatoria: "+total);
        }
    }

    public void ListaTareas(){
        List<TaskList> task = new ArrayList<>();
        TaskList tareaIndividual = new TaskList();


        tareaIndividual.setTaskName("ir a votar");
        tareaIndividual.setTaskDescription("escuela, mesa 5");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();

        tareaIndividual.setTaskName("Sacar al perro");
        tareaIndividual.setTaskDescription("LLevarlo al parque");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();//nueva tarea

        tareaIndividual.setTaskName("Hacer la cama");
        tareaIndividual.setTaskDescription("de no ser así me regañan");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new TaskList();



        task.get(1).setDone(true);
        task.get(3).setDone(true);


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