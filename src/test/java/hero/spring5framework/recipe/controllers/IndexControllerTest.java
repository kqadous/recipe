package hero.spring5framework.recipe.controllers;

import hero.spring5framework.recipe.domain.Recipe;
import hero.spring5framework.recipe.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    IndexController indexController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(recipeService);
    }

    @Test
    void goIndex() {

        Set<Recipe> recipes = new HashSet<>();

        recipes.add(new Recipe());

        Recipe recipe = new Recipe();
        recipe.setId(1L);

        recipes.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipes);

        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);

        String returnedPage = indexController.goIndex(model);

        assertEquals("index" , returnedPage);

        verify(model , times(1)).addAttribute(eq("recipes"), argumentCaptor.capture());

        verify(recipeService , times(1)).getRecipes();

        Set<Recipe> indRecipes = argumentCaptor.getValue();

        assertEquals(2 , indRecipes.size());
    }
}