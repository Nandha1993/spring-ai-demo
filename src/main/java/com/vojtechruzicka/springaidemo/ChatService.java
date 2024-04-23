package com.vojtechruzicka.springaidemo;

import org.springframework.ai.chat.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String queryAi(String prompt) {
        return chatClient.call(prompt);
    }

}
