package cn.edu.seu.testCoreClass;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Arrays;

public class TestString {
    private final static Logger logger=Logger.getLogger(TestString.class);

    private String string="Test String";

    @Test
    public void testIndexOf(){
        logger.info(string.indexOf('t'));
        logger.info(string.indexOf("tr"));
        logger.info(string.indexOf("tr",3));
        logger.info(string.indexOf('t',3));
        logger.info(string.indexOf('t',4));

    }

    @Test
    public void testToUpperCase(){
        String s="hello";
        logger.info(s);
        s=s.toUpperCase();
        logger.info(s);
    }

    @Test
    public void testInitialize(){
        String string1="a";
        logger.info(string1.length());
        String string2=new String(new char[]{'h','e','l','l','o'});
        logger.info(string2+" "+string2.length());
        String string3=new String(new char[]{'a'});
        logger.info(string3.equals(string1));
        char[] chars={};
        logger.info(chars.length);

        char[] chars0=new char[]{'h','e','l','l'};
        String string4=new String(chars0,0,1);
        logger.info(string4);
        for(int i=0;i<string4.length();i++){
            logger.info(string4.charAt(i));
        }


        char[] chars1=new char[5];
        logger.info(chars1.length);
        char[] chars2=new char[]{'a','b'};
        logger.info(chars2.length);

    }

    @Test
    public void testTraversalString(){
        String string="hello";
        for(int i=0;i<string.length();i++){
            logger.info(string.charAt(i));
        }
        logger.info(string.charAt(0));
        logger.info(string.charAt(5));

    }

    @Test
    public void testEquals(){
        String string="hello";
        String string1="hello";
        logger.info(string.equals(string1));
        logger.info(string==string1);

        String string2="Hello".toLowerCase();
        logger.info(string2);
        logger.info(string==string2);
        logger.info(string.equals(string2));

        String string3="HELLO";
        logger.info(string.equalsIgnoreCase(string3));
    }

    @Test
    public void testContains(){
        String string="hello";
        logger.info(string.contains("h"));
        logger.info(string.contains("he"));
        logger.info(string.contains("hl"));
    }

    @Test
    public void testSearch(){
        String string="hello";
        logger.info(string.indexOf("he",0));
        logger.info(string.indexOf("he"));
        logger.info(string.indexOf("l"));
        logger.info(string.lastIndexOf("l"));
        logger.info(string.startsWith("h"));
        logger.info(string.startsWith("h",3));
        logger.info(string.startsWith("l",2));
        logger.info(string.endsWith("o"));
        logger.info(string.endsWith("lo"));
    }

    @Test
    public void testSubString(){
        String string="test subString";
        logger.info(string.substring(2));
        logger.info(string.substring(6));
        logger.info(string.substring(2,7));
        logger.info(string.substring(2,string.length()));
    }


    @Test
    public void testTrim(){
        String string="  \tHello\r\n ";
        //返回一个新的字符串
        logger.info(string.trim());
        logger.info(string.contains(" "));
    }

    @Test
    public void testReplace(){
        /**
         * replace和replaceAll均是替换所有，若replaceAll参数为正则表达式，replace是字符串和字符，
         * 若replaceAll参数不是正则表达式，则其结果是和replace相同效果。
         */
        String string="hello word";
        logger.info(string.replace('o','t'));
        logger.info(string.replace("el","le"));
        logger.info(string.replaceAll("o","t"));
        logger.info(string.replaceAll("\\s+","+"));
        logger.info(string.replaceFirst("o","t"));
        logger.info(string);
    }

    @Test
    public void testSplit(){
        /**
         * split()方法返回的是数组
         */
        String string="A,B,C";
        String[] strings=string.split(",");
        logger.info(Arrays.toString(strings));
    }

    @Test
    public void testJoin(){
        String[] arr={"A","B","C"};
        String s=String.join("++",arr);
        logger.info(s);
    }

    @Test
    public void testValueOf(){
        String[] strings=new String[]{"Stringing","leading"};
        logger.info(String.valueOf(1));
        logger.info(String.valueOf('a'));
        logger.info(String.valueOf(12L));
        logger.info(String.valueOf(1.2f));
        logger.info(String.valueOf(2.2));
        logger.info(String.valueOf(true));
        logger.info(String.valueOf("12"));
        logger.info(String.valueOf(Arrays.toString(strings)));
    }

    @Test
    public void testToCharArray(){
        String str="hello";
        //chars获得只是str的一拷贝
        char[] chars=str.toCharArray();
        chars[1]='o';
        logger.info(str);
        logger.info(Arrays.toString(chars));
        String string=new String(chars);
        logger.info(string);
        logger.info(string.compareTo("hello"));

    }



}
