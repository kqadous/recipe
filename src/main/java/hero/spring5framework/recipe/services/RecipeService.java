package hero.spring5framework.recipe.services;

import hero.spring5framework.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
