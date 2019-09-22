package cn.edu.seu.testCoreClass;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;


public class TestBigDecimal {
    private static final Logger logger=Logger.getLogger(TestBigDecimal.class);
    private BigDecimal bigDecimal=new BigDecimal(12.3333333);

    @Test
    public void testInit(){
        BigDecimal bigDecimal1=new BigDecimal("12.33333");
        BigDecimal bigDecimal2=new BigDecimal(new char[]{'1','.','1'});
//        BigDecimal bigDecimal3=new BigDecimal(new char[]{'a','b'},0,2);     //false

        //使用mathContext表示为科学表示方法并设置精确度
        BigDecimal bigDecimal4=new BigDecimal("12.44",new MathContext(3));
        logger.info(bigDecimal4);
        BigDecimal bigDecimal5=new BigDecimal(new BigInteger("3"));
    }

    /**
     * 调用abs()之后不影响本身
     */
    @Test
    public void testAbs(){
        BigDecimal bigDecimal1=new BigDecimal("-20");
        logger.info(bigDecimal1.abs());
        logger.info(bigDecimal1);
    }

    @Test
    public void testRemainder(){
        BigDecimal bigDecimal1=new BigDecimal("144.1441111");
        BigDecimal bigDecimal2=new BigDecimal("16.12");
        logger.info(bigDecimal1.remainder(bigDecimal2));
        logger.info(bigDecimal1.remainder(bigDecimal2,new MathContext(1)));
    }
}
