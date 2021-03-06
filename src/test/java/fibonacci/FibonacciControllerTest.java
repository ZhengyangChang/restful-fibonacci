package fibonacci;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FibonacciControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void noParamFibonacciShouldReturnDefault() throws Exception {

        this.mockMvc.perform(get("/fibonacci"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("[0,1,1,2,3]"));
    }

    @Test
    public void paramShouldReturnCorrectFibonacciArray() throws Exception {

        this.mockMvc.perform(get("/fibonacci").param("n", "12"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("[0,1,1,2,3,5,8,13,21,34,55,89]"));
    }

    @Test
    public void invalidParameterShouldReturn400Err() throws Exception {

        this.mockMvc.perform(get("/fibonacci").param("n", "-2"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

}