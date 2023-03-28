package com.alexp.openai.api.complition.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Oleksandr Pavliuk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

  private String role;

  private String content;
}
