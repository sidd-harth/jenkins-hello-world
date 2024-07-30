package com.kodekloud.hello_demo;

import com.kodekloud.hello_demo.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
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
    public void testHello_returnsNotNull() {
        String response = helloController.hello();
        assertNotNull(response); // Assert response is not null
    }

    @Test
    public void testHello_returnsNotEmptyString() {
        String response = helloController.hello();
        assertFalse(response.isEmpty()); // Assert response is not empty string
    }

    @Test
    public void testHello_returnsStringWithCorrectLength() {
        String response = helloController.hello();
        assertEquals(21, response.length()); // Assert response length is 21
    }

    @Test
    public void testHello_startsWithExpectedGreeting() {
        String response = helloController.hello();
        assertTrue(response.startsWith("Hello"));  // Assert starts with "Hello"
    }

    @Test
    public void testHello_endsWithExpectedGreeting() {
        String response = helloController.hello();
        assertTrue(response.endsWith("Users!")); // Assert ends with "Users!"
    }
}