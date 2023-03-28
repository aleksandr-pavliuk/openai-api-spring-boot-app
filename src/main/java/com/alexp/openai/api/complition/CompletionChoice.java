package com.alexp.openai.api.complition;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class CompletionChoice {

	private String text;

	private int index;

	private Object logprobs;

	@JsonProperty("finish_reason")
	private String finishReason;
}
