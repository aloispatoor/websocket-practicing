package com.websocket.wspracticing.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private String content;
    private String senderName;
    private String receiverName;
}
