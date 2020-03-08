package hero.spring5framework.recipe.controllers;

import hero.spring5framework.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

//    private final UnitOfMeasureRepository unitOfMeasureRepository;
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
//    public IndexController(UnitOfMeasureRepository unitOfMeasureRepository, RecipeService recipeService) {
//        this.unitOfMeasureRepository = unitOfMeasureRepository;
//        this.recipeService = recipeService;
//    }

    @RequestMapping({"" , "/" , "/index" , "/index.html"})
    public String goIndex(Model model) {
        log.debug("Getting index page...");
//        System.out.println("Used unit of measure::"+unitOfMeasureRepository.findByDescription("Cup").get().getDescription());
//
//        Optional<UnitOfMeasure> findByDescriptionAndCreationDate = unitOfMeasureRepository.
//                                                                     findByDescriptionAndCreationDate("Cup"
//                                                                        , LocalDate.now().minusDays(2));
//
//        Optional<UnitOfMeasure> findByCreationDateBetween = unitOfMeasureRepository.findByCreationDateBetweenAndDescriptionContains
//                                                                        (LocalDate.now().minusDays(1), LocalDate.now(), "Cup");
//
//        System.out.println("Filtering results 1 :::" +(findByDescriptionAndCreationDate.isPresent() ?
//                                                        findByDescriptionAndCreationDate.get().getDescription()
//                                                        : "No Data Found"));
//
//        System.out.println("Filtering results 2 :::" +(findByCreationDateBetween.isPresent() ?
//                findByCreationDateBetween.get().getDescription()
//                : "No Data Found"));

        model.addAttribute("recipes" , recipeService.getRecipes());

        return "index";
    }
}
