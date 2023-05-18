package kz.bitlab.treello.services;

import kz.bitlab.treello.entities.TaskCategories;

import java.util.List;

public interface CategoryService {
    TaskCategories addTaskCategory(TaskCategories taskCategory);
    List<TaskCategories> getAllTaskCategories();
    TaskCategories getTaskCategory(Long id);
    void deleteTaskCategory(Long id);
}
