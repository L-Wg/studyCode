package cn.edu.seu.testCollection;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {


    @Test
    public void testTraverse(){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        for(String item:list){
            System.out.println(item);
        }

        int i=0;
        for(Iterator<String> it = list.iterator(); it.hasNext(); ){
            String s=it.next();
            Assert.assertEquals(list.get(i),s);
            i++;
        }
    }
}
