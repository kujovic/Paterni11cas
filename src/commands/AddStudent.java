/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import java.util.List;
import model.Student;

/**
 *
 * @author stefan.kujovic
 */
public class AddStudent implements Command{

    List<Student> list;
    Student student;

    public AddStudent(List<Student> list, Student student) {
        this.list = list;
        this.student = student;
    }
    
    
    
    @Override
    public void execute() {
        list.add(student);
    }

    @Override
    public void undo() {
        list.remove(student);
    }
    
}
