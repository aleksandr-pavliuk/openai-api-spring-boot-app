package com.alexp.openai.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class Model {

    String id;

    String object;

    @JsonProperty("owned_by")
    String ownedBy;

    List<Permission> permissions;

    String root;

    String parent;
}
