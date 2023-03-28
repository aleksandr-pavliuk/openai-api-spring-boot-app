package com.alexp.openai.api.complition.chat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Oleksandr Pavliuk
 */
@Data
public class ChatCompletionChoice {

    private Integer index;

    private ChatMessage message;

    @JsonProperty("finish_reason")
    private String finishReason;
}
