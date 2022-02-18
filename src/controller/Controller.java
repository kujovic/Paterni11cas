/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import commands.AddStudent;
import commands.Command;
import commands.CommandManager;
import java.util.ArrayList;
import model.Student;
import java.util.List;

/**
 *
 * @author stefan.kujovic
 */
public class Controller {
    private List<Student> list;
    private CommandManager commandManager;
    

    public Controller() {
        list = new ArrayList<>(); 
        commandManager = new CommandManager();
    }
    
    public void add(Student student){
        Command command = new AddStudent(list, student);
        commandManager.execute(command);
        
    }
    
    public void undo(){
        commandManager.undo();
    }
    
    public void redo(){
         commandManager.redo();
    }
    
    public List<Student> getStudents(){
        return list;
    }
}
