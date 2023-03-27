package com.alexp.openai.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class Permission {

    String id;

    String object;

    @JsonProperty("allow_create_engine")
    boolean allowCreateEngine;

    @JsonProperty("allow_sampling")
    boolean allowSampling;

    @JsonProperty("allow_logprobs")
    boolean allowLogprobs;

    @JsonProperty("allow_search_indices")
    boolean allowSearchIndices;

    @JsonProperty("allow_view")
    boolean allowView;

    @JsonProperty("allow_fine_tuning")
    boolean allowFineTuning;

    String organization;

    String group;

    boolean isBlocking;
}
