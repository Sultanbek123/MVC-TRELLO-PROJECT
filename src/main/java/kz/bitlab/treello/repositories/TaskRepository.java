package kz.bitlab.treello.repositories;

import jakarta.transaction.Transactional;
import kz.bitlab.treello.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface TaskRepository extends JpaRepository<Task,Long> {
    Task findAllById(Long id);
}
