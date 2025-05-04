package com.bupt.ai.langchain4j.controller;

import com.bupt.ai.langchain4j.assistant.AIAgent;
import com.bupt.ai.langchain4j.model.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@Tag(name = "GG智邮")
@RestController
@RequestMapping("/xiaozhi")
public class ChatController {

    @Autowired
    private AIAgent aiAgent;

    @Operation(summary = "对话")
    @PostMapping(value = "/chat",produces = "text/stream;charset=utf-8")
    public Flux<String> chat(@RequestBody ChatForm chatForm){
        return aiAgent.chat(chatForm.getMemoryId(),chatForm.getMessage());
    }
}
