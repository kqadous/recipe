package hero.spring5framework.recipe.repositories;

import hero.spring5framework.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe , Long> {
}
