package com.alexp.openai.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class Model {

    private String id;

    private Long created;

    private String object;

    @JsonProperty("owned_by")
    private String ownedBy;

    private List<Permission> permissions;

    private String root;

    private String parent;
}
