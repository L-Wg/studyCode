package cn.edu.seu.testJavaAPI;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

public class TestArray {
    private final static Logger logger=Logger.getLogger(TestArray.class);
    private final static int[] ns={ 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
    private final static String[] strings={"banana", "apple", "pear" };

    @Test
    public void testIntSort(){

        logger.info(Arrays.toString(ns));
        Arrays.sort(ns);
        logger.info(Arrays.toString(ns));

    }
    @Test
    public void testStringSort(){
        String[] strings={"banana", "apple", "pear" };
        Arrays.sort(strings);

        logger.info(Arrays.toString(strings));

    }
    @Test
    public void testMultiArray(){
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        logger.info(Arrays.deepToString(ns));
    }


}
