package xyz.easy_coding.jackson_example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void unpack() throws Exception {
        final String src = IOUtils.toString(this.getClass().getResourceAsStream("foo.json"), "utf-8");
        ObjectMapper mapper = new ObjectMapper();

        Foo result = mapper.readValue(src, Foo.class);
        assertNotNull(result);
    }
}