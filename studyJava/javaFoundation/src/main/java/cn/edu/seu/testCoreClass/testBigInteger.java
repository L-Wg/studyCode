package cn.edu.seu.testCoreClass;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class testBigInteger {
    private static final Logger logger=Logger.getLogger(testBigInteger.class);
    BigInteger bigInteger=new BigInteger("1234567");

    @Test
    public void testInit(){

        logger.info(bigInteger);
    }

    @Test
    public void testArithmetic(){
        BigInteger bigInteger0=new BigInteger("123454321");
        BigInteger bigInteger1=bigInteger.add(bigInteger0);
        logger.info(bigInteger1);
        logger.info(bigInteger0.multiply(bigInteger1));
        logger.info(bigInteger0.divide(bigInteger1));
        logger.info(bigInteger1.divide(bigInteger0));
        logger.info(bigInteger0.max(bigInteger1));
        logger.info(bigInteger0.min(bigInteger1));
        logger.info(bigInteger0.mod(bigInteger1).divide(new BigInteger("2")));
        logger.info(bigInteger0.modInverse(bigInteger1));
        logger.info(bigInteger.negate());
    }

    /**
     * 创建BigInteger实例时，val和radix是相匹配的，
     */
    @Test
    public void testToString(){
        BigInteger bigInteger1=new BigInteger("101",2);
        logger.info(bigInteger1);
        logger.info(bigInteger1.toString(2));
    }

    /**
     * bitLength是Integer二进制表示所有位的个数；
     * bitCount是Integer二进制中1的个数
     */
    @Test
    public void testCount(){
        logger.info(bigInteger.toString(2));
        logger.info(bigInteger.bitLength());
        logger.info(bigInteger.bitCount());

    }

    /**
     * and是对两个Integerde 二进制做与运算
     * andNot是做异或运算
     */
    @Test
    public void testAnd(){
        BigInteger bigInteger1=new BigInteger("12");
        logger.info(bigInteger1.toString(2));
        logger.info(bigInteger.toString(2));
        logger.info(bigInteger.and(bigInteger1));
        logger.info(bigInteger.andNot(bigInteger1));

    }

    /**
     * *Value()与*ValueExact()相比，当BigInteger超过范围转换范围时，
     * 前者会取相应的位数，而后者多一个范围检测或抛出一个异常，从而保证的结果的准确性。
     */

    @Test
    public void testValue(){
//        BigInteger bigInteger=new BigInteger("123456789098765432");
        logger.info(bigInteger.byteValue());
        logger.info(bigInteger.intValue());
        logger.info(bigInteger.intValueExact());
        logger.info(bigInteger.floatValue());
        logger.info(bigInteger.doubleValue());
        logger.info(bigInteger.shortValueExact());

    }


}
