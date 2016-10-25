package org.craftsmenlabs.stories.api.models.validatorentry;

import java.util.List;
import org.craftsmenlabs.stories.api.models.Rating;
import org.craftsmenlabs.stories.api.models.Violation;
import lombok.*;

@Data
public class EstimationValidatorEntry extends AbstractValidatorEntry {
    private Float estimation;

    @Builder
    public EstimationValidatorEntry(Float estimation, float pointsValuation, List<Violation> violations, Rating rating, boolean isActive) {
        this.estimation = estimation;
        super.setPointsValuation(pointsValuation);
        super.setViolations(violations);
        super.setRating(rating);
        super.setActive(isActive);
    }
}