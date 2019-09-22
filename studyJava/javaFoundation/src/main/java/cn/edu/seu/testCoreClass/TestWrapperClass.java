package cn.edu.seu.testCoreClass;

import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestWrapperClass {

    private static final Logger logger=Logger.getLogger(TestWrapperClass.class);
    private Integer integer=Integer.valueOf(100);

    @Test
    public void testInit(){

        logger.info(integer);

    }

    @Test
    public void testIntegerMethod(){
        logger.info(integer.compareTo(Integer.valueOf(100)));
        logger.info(integer.compareTo(Integer.valueOf(10)));
        logger.info(integer.toString()+1);


        Integer integer1=Integer.valueOf(200);
        logger.info(Integer.toBinaryString(integer1));
        logger.info(Integer.parseInt("11001000",2));
        byte integerByte=integer1.byteValue();
        int intNum=(byte)200;
        logger.info(intNum);


        System.out.println(integerByte);
    }
}
