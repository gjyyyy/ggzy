package com.bupt.ai.langchain4j;

import com.bupt.ai.langchain4j.assistant.SeparateMemoryAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class calTest {

    @Autowired
    private SeparateMemoryAssistant separateMemoryAssistant;

    @Test
    public void test(){
        String answer = separateMemoryAssistant.chat(10, "868756756490.4的平方根是多少？");
        System.out.println(answer);
    }
}

