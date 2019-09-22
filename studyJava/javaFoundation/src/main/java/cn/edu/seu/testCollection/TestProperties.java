package cn.edu.seu.testCollection;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {
    private static final Logger logger=Logger.getLogger(TestProperties.class);
    private Properties properties=new Properties();

    @Test
    public void testPropertiesMethod() throws IOException {
        InputStream inputStream=TestProperties.class.getClassLoader().getResourceAsStream("log4j.properties");
        logger.info(TestProperties.class);
        properties.load(inputStream);
        logger.info(properties.getProperty("log4j.rootLogger"));
    }
}
