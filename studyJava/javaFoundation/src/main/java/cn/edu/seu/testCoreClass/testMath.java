package cn.edu.seu.testCoreClass;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Random;

public class testMath {
    private static final Logger logger=Logger.getLogger(testMath.class);

    @Test
    public void testMathMathod(){

        logger.info(Math.abs(-10));
        logger.info(Math.abs(-10L));
        logger.info(Math.addExact(1,3));
        logger.info(Math.addExact(1L,1L));
        logger.info(Math.max(2,1));
        logger.info(Math.decrementExact(5));
        logger.info(Math.sqrt(4.0));
        logger.info(Math.floorDiv(4L,6l));
        logger.info(Math.floorDiv(12,5));
        logger.info(Math.floorDiv(12,-6));
        logger.info(Math.floorDiv(12,-7));
        logger.info(Math.random());
        logger.info(Math.rint(4.0));
        logger.info(Math.rint(4.2));
        logger.info(Math.rint(4.8));
    }

    @Test
    public void testRandom(){
        Random random=new Random();
        logger.info(random.nextInt());
        logger.info(random.nextInt(400));
        logger.info(random.nextBoolean());
        logger.info(random.nextLong());
    }
}
