package cn.edu.seu.testCoreClass;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestEnum {
    private static final Logger logger=Logger.getLogger(TestEnum.class);

    @Test
    public void testEnumName(){
        logger.info(Color.RED.name());
    }
    @Test
    public void testOrdinal(){
        logger.info(Color.BLUE.ordinal());
    }

    public enum Color{
        RED, GREEN, BLUE;
    }
}
