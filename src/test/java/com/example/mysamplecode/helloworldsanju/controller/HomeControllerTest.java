package com.example.mysamplecode.helloworldsanju.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
public class HomeControllerTest {
@Autowired
    private MockMvc mockMvc;

@Test
void  testGreeting() throws Exception{
    String path = "/";
    mockMvc.perform(get(path))
            .andDo(print())
//when
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello, World")))

}
}
