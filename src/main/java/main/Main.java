/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author Dalila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //Teste para testar a aplicação com o Banco de Dados;
       
//        ProjectController projectController = new ProjectController();
//
//        Project project = new Project(); 
//        project.setName("Projeto teste");
//        project.setDescription("description");      
//        projectController.save(project);  
//
//        project.setName("Novo nome do projeto");
//        projectController.update(project);  
//
//        List<Project> projects = projectController.getAll(); 
//        System.out.println("Total de projetos = " + projects.size());
//
//
//        TaskController taskController = new TaskController();
//
//        Task task = new Task(); 
//        task.setIdProject();
//        task.setName("Criar as telas de aplicação");
//        task.setDescription("Devem ser criadas telas para os cadastros");
//        task.setNotes("Sem notas");
//        task.setIsCompleted(false);
//        task.setDeadline(new Date());
//        taskController.save(task);
//
//        task.setName("Alterara telas da aplicação");
//        List<Task> tasks = taskController.getAll(); 
//        System.out.println("Total de tarefas = " + tasks.size());
    }
}
