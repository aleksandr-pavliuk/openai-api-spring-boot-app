package com.alexp.openai.api.edit;

import com.alexp.openai.api.complition.Usage;
import lombok.Data;

import java.util.List;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class EditResponse {

  public String object;

  public long created;

  public List<EditChoice> choices;

  public Usage usage;
}
