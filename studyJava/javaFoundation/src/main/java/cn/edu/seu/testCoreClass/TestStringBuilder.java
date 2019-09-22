package cn.edu.seu.testCoreClass;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestStringBuilder {
    private static final Logger logger=Logger.getLogger(TestStringBuilder.class);

    private StringBuilder strBuilder=new StringBuilder("hello");

    @Test
    public void testAppend(){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<10;i++){
            if(stringBuilder.length()==0){
                stringBuilder.append(i);
            }else{
                stringBuilder.append(",").append(i);
            }
        }
        logger.info(stringBuilder);
        String string=stringBuilder.toString();
        string+=","+"11";
        for(int i=0;i<string.length();i++){
//            System.out.println(string.charAt(i));
        }
        logger.info(string);
        logger.info(stringBuilder);


    }

    @Test
    public void testIndexOf(){
        logger.info(strBuilder.indexOf("l"));
        logger.info(strBuilder.indexOf("l",4));
    }

    @Test
    public void testReplace(){
        /**
         * replace对StringBuilder的操作会影响到对象本身。
         */
        StringBuilder stringBuilder=new StringBuilder(strBuilder);
        StringBuilder stringBuilder1=stringBuilder.replace(0,3,"p");
        logger.info(stringBuilder1);
        logger.info(stringBuilder);
    }

    @Test
    public void testInsertAndDel(){
        strBuilder.insert(0,'p');
        logger.info(strBuilder);
        strBuilder.insert(1,'m');
        logger.info(strBuilder);

        strBuilder.delete(0,1);
        logger.info(strBuilder);
        strBuilder.deleteCharAt(0);
        logger.info(strBuilder);
        strBuilder.reverse();
        logger.info(strBuilder);
    }
}
