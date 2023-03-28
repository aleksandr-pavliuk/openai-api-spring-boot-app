package com.alexp.openai.api.complition.chat;
import com.alexp.openai.api.complition.Usage;
import lombok.Data;

import java.util.List;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class ChatCompletionResponse {

    private String id;

    private String object;

    private long created;

    private String model;

    private List<ChatCompletionChoice> choices;

    private Usage usage;

}
