package hero.spring5framework.recipe.repositories;

import hero.spring5framework.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure , Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

    Optional<UnitOfMeasure> findByDescriptionAndCreationDate(String description , LocalDate creationDate);

    Optional<UnitOfMeasure> findByCreationDateBetweenAndDescriptionContains(LocalDate fromDate , LocalDate toDate
                                                                                , String description);
}
