/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commands;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stefan.kujovic
 */
public class CommandManager {

    private List<Command> list;
    private int current;

    public CommandManager() {
        list = new ArrayList<>();
        current = -1;
    }

    public void execute(Command command) {
        command.execute();
        current++;
        list.add(current, command);
        if (current <= list.size() - 1) {
            List<Command> newList = new ArrayList<>();
            for (int i = 0; i <= current; i++) {
                newList.add(list.get(i));
            }
            list = newList;
        }
    }

    public void undo() {
        if (current >= 0) {
            list.get(current).undo();
            current--;
        }
    }
    
    public void redo() {
        if (current < list.size()-1) {
            current++;
            list.get(current).execute();
            
        }
    }
}
