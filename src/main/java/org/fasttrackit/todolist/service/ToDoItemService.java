package org.fasttrackit.todolist.service;

import org.fasttrackit.todolist.domain.ToDoItem;
import org.fasttrackit.todolist.persistance.ToDoItemRepository;
import org.fasttrackit.todolist.transfer.CreateToDoItemReqouest;
import org.fasttrackit.todolist.transfer.UpdateToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {

    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();

    public void createToDoItem(CreateToDoItemReqouest reqouest) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating to-do-item: " + reqouest);
        toDoItemRepository.createToDoItem((reqouest));
    }

    public void updateToDoItem(long id, UpdateToDoItemRequest reqouest) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Updating to-do-item: " + reqouest);
        toDoItemRepository.updateToDoItem(id,reqouest.isDone());
    }
    public void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Deleting item " + id);
        toDoItemRepository.deleteToDoItem(id);
    }
    public List<ToDoItem> getToDoItem(
    ) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Retriving to-do-items..");
        return toDoItemRepository.getToDoItems();
    }
}
