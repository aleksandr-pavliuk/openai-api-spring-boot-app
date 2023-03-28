package com.alexp.openai.api.image;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author Oleksandr Pavliuk
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ImageRequest {

  @NonNull
  private String prompt;

  private Integer n;

  private String size;

  @JsonProperty("response_format")
  private String responseFormat;
}
