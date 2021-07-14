package br.com.rafaellbarros.websocketdemo.model;

import br.com.rafaellbarros.websocketdemo.model.enums.MessageType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;
}
