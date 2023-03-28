package com.alexp.openai.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class Permission {

    private String id;

    private String object;

    private Long created;

    @JsonProperty("allow_create_engine")
    private boolean allowCreateEngine;

    @JsonProperty("allow_sampling")
    private boolean allowSampling;

    @JsonProperty("allow_logprobs")
    private boolean allowLogprobs;

    @JsonProperty("allow_search_indices")
    private boolean allowSearchIndices;

    @JsonProperty("allow_view")
    private boolean allowView;

    @JsonProperty("allow_fine_tuning")
    private boolean allowFineTuning;

    private String organization;

    private String group;

    private boolean isBlocking;
}
