package heroku_demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
 
import heroku_demo.entity.Villager;

public interface CommentRepository extends CrudRepository<Villager, Integer> {
	
	List<Villager> findAll();

}
