package org.fasttrackit.todolist;

import org.fasttrackit.todolist.domain.ToDoItem;
import org.fasttrackit.todolist.persistance.ToDoItemRepository;
import org.fasttrackit.todolist.transfer.CreateToDoItemReqouest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, IOException, ClassNotFoundException {
        CreateToDoItemReqouest reqouest= new CreateToDoItemReqouest();
        reqouest.setDescription("Learn JDBS");
        reqouest.setDeadline(LocalDate.now().plusWeeks(1));

        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
       // toDoItemRepository.createToDoItem(reqouest);
       // toDoItemRepository.updateToDoItem(1,true);
       // toDoItemRepository.deleteToDoItem(1);
        List<ToDoItem> toDoItems = toDoItemRepository.getToDoItems();
        System.out.println(toDoItems);

    }
}
