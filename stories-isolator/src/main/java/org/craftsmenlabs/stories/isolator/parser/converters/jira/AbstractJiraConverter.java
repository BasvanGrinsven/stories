package org.craftsmenlabs.stories.isolator.parser.converters.jira;

import org.apache.commons.lang3.StringUtils;
import org.craftsmenlabs.stories.api.models.config.FieldMappingConfig;
import org.craftsmenlabs.stories.isolator.model.jira.JiraJsonIssue;

import java.util.Arrays;

/**
 * Responsible for
 *
 * @param <T>
 */
public abstract class AbstractJiraConverter<T> {
    protected FieldMappingConfig config;

    public AbstractJiraConverter(FieldMappingConfig config) {
        this.config = config;
    }

    public abstract T convert(JiraJsonIssue jiraJsonIssue);

    public boolean supportsIssue(JiraJsonIssue issue) {
        return Arrays.stream(this.getSupportedTypes())
                .anyMatch(supportedType ->
                        StringUtils.equalsIgnoreCase(supportedType, issue.getType()));
    }

    public abstract String[] getSupportedTypes();
}
