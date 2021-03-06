package fr.mmarie.core.jira;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.VisibleForTesting;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@NoArgsConstructor
public class TransitionConfiguration {
    @NotEmpty
    @NotNull
    @JsonProperty
    private String name;

    @NotEmpty
    @NotNull
    @JsonProperty
    private List<String> keywords;

    @VisibleForTesting
    public TransitionConfiguration(String name, List<String> keywords) {
        this.name = name;
        this.keywords = keywords;
    }
}
