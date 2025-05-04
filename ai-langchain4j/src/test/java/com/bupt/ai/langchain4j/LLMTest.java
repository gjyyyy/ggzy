package com.bupt.ai.langchain4j;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootTest
public class LLMTest {

//    @Test
//    public void testGPT(){
//        OpenAiChatModel model = OpenAiChatModel.builder()
//                .baseUrl("http://langchain4j.dev/demo/openai/v1")
//                .apiKey("demo")
//                .modelName("gpt-4o-mini")
//                .build();
//
//        String res1 = model.chat("你好");
//        System.out.println(res1);
//    }
//
//    @Autowired
//    private OpenAiChatModel openAiChatModel;
//    @Test
//    public void testOpenAi(){
//        String answer = openAiChatModel.chat("你是谁？");
//        System.out.println(answer);
//    }
//
//    @Autowired
//    private OllamaChatModel chatModel;
//
//    @Test
//    public void testSpringboot(){
//        String answer = chatModel.chat("你是谁？");
//        System.out.println(answer);
//    }
//
//    @Autowired
//    private QwenChatModel qwenChatModel;
//    @Test
//    public void testBaiLian(){
//        String answer = qwenChatModel.chat("你是谁？");
//        System.out.println(answer);
//    }

}
