/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package commands;

/**
 *
 * @author stefan.kujovic
 */
public interface Command {
    void execute();
    
    void undo();
}
