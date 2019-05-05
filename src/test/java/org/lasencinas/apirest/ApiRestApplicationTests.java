package org.lasencinas.apirest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lasencinas.apirest.resources.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApiRestApplicationTests {

    /* ---- Properties ---- */
    @Autowired
    private MockMvc mockMvc = null;


    /* ---- Tests ---- */
    @Test
    public void numberOfTopicsTest() throws Exception {
        mockMvc.perform(get("/number"))
                .andExpect(status().isOk())
                .andExpect(content().string("3"));
    }

    @Test
    public void getAllTopicsTest() throws Exception {
        mockMvc.perform(get("/topics").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().json("[{id : 'spring', name : 'Spring Framework', description : " +
                        "'Spring Framework Description'}, " +
                        "{id : 'java', name : 'Core Java', description : 'Core Java Description'}, " +
                        "{id : 'javascript', 'name' : 'JavaScript', 'description' : 'JavaScript Description'}]"));
    }

    @Test
    public void getTopicTest() throws Exception {
        mockMvc.perform(get("/topics/spring").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    /*@Test
    public void addTopicsTest() throws Exception {
        mockMvc.perform(post("/topics")
                .param("id", "javaee")
                .param("name", "Java Enterpise")
                .param("description", "Java Enterprise Edition")
        );
        // check that it is in the BBDD.

        mockMvc.perform(get("/topics/javaee").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }*/
}
