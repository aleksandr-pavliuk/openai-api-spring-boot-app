package com.alexp.openai.api.complition;

import lombok.Data;

import java.util.List;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class CompletionResponse {

	private String id;

	private String object;

	private int created;

	private String model;

	private List<CompletionChoice> choices;

	private Usage usage;
}