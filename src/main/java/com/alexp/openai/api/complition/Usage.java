package com.alexp.openai.api.complition;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class Usage{

	@JsonProperty("completion_tokens")
	private int completionTokens;

	@JsonProperty("prompt_tokens")
	private int promptTokens;

	@JsonProperty("total_tokens")
	private int totalTokens;
}
