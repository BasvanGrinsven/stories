package org.craftsmenlabs.stories.api.models.validatorentry.validatorconfig;

import lombok.Data;

import java.util.List;

@Data
public class ScorerConfigCopy {
    private ValidatorEntryCopy backlog;
    private ValidatorEntryCopy issue;
    private StoryValidatorEntryCopy story;
    private CriteriaValidatorEntryCopy criteria;
    private ValidatorEntryCopy estimation;

    @Data
    public static class ValidatorEntryCopy {
        private float ratingtreshold;
        private boolean active;
    }

    @Data
    public static class StoryValidatorEntryCopy extends ValidatorEntryCopy {
        private List<String> asKeywords;
        private List<String> iKeywords;
        private List<String> soKeywords;
    }

    @Data
    public static class CriteriaValidatorEntryCopy extends ValidatorEntryCopy {
        private List<String> givenKeywords;
        private List<String> whenKeywords;
        private List<String> thenKeywords;
    }
}
