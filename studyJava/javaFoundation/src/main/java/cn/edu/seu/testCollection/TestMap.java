package cn.edu.seu.testCollection;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestMap {
    private static final Logger logger=Logger.getLogger(TestMap.class);

    @Test
    public void testPut(){
        Map<String ,Integer> map=new HashMap<>();
        map.put("apple",123);
        map.put("banana",2345);
        logger.info(map.get("apple"));
        logger.info(map.put("apple",567));
        logger.info(map.get("apple"));
        logger.info(map.put("water",1000));
    }
    @Test
    public void testTraverse(){
        Map<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        assertEquals(map.get("c"),new Integer(3));

        for(String key:map.keySet()){
            System.out.println(map.get(key));
        }

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());

        }
    }
}
