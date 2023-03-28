package com.alexp.openai.api.edit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class EditRequest {

  private String model;

  private String input;

  @NonNull
  private String instruction;

  private Integer n;

  private Double temperature;

  @JsonProperty("top_p")
  private Double top_p;

}
