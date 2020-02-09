package hero.spring5framework.recipe.repositories;

import hero.spring5framework.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category , Long> {

    Optional<Category> findByDescription(String description);
}
