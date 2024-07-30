package com.kodekloud.hello_demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.kodekloud.hello_demo.*;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private HelloController helloController; // Inject HelloController instance

    @Test
    public void welcome_ok() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello, KodeKloud community!")));
    }

    @Test
    public void welcome_returnsNotNull() throws Exception {
      mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().string(notNullValue()));

    }

    @Test
    public void welcome_returnsNotEmpty() throws Exception {
      mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().string(not(isEmptyString()))); 

    }

    @Test
    public void welcome_returnsCorrectLength() throws Exception {
      mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().string(hasLength(27))); 

    }

    @Test
    public void welcome_startsWithExpectedGreeting() throws Exception {
      mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().string(startsWith("Hola"))); 

    }

    @Test
    public void welcome_endsWithExpectedGreeting() throws Exception {
      mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().string(endsWith("community!")));

    }
  }