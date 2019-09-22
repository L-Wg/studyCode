package cn.edu.seu.testCoreClass;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.StringJoiner;

public class TestStringJoin {
    private static final Logger logger=Logger.getLogger(TestStringJoin.class);

    @Test
    public void testJoinAdd(){
        String[] strings={"bob","alice","tome"};
        StringJoiner stringJoiner=new StringJoiner(",");
        for(String string:strings){
            stringJoiner.add(string);
        }

        logger.info(stringJoiner);
        //length()返回的是stringJoin中所有字符的个数
        logger.info(stringJoiner.length());
        logger.info(strings.length);

        StringJoiner stringJoiner1=new StringJoiner(",","Hello ","!");
        for(String string:strings){
            stringJoiner1.add(string);
        }
        logger.info(stringJoiner1);
    }


}
