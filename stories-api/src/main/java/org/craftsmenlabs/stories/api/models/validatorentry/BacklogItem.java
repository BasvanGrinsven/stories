package org.craftsmenlabs.stories.api.models.validatorentry;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.craftsmenlabs.stories.api.models.Rating;
import org.craftsmenlabs.stories.api.models.violation.Violation;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = FeatureValidatorEntry.class),
        @JsonSubTypes.Type(value = BugValidatorEntry.class),
        @JsonSubTypes.Type(value = EpicValidatorEntry.class)
})
//http://www.davismol.net/2015/03/05/jackson-json-deserialize-a-list-of-objects-of-subclasses-of-an-abstract-class/
public abstract class BacklogItem extends AbstractScorable implements Rankable {

    public BacklogItem() {
    }

    public BacklogItem(float pointsValuation, List<Violation> violations, Rating rating) {
        super(pointsValuation, violations, rating);
    }
}