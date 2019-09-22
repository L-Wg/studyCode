package cn.edu.seu.testCollection;

import com.sun.org.apache.bcel.internal.generic.LSTORE;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

    private static final Logger logger=Logger.getLogger(TestList.class);


    /**
     * ArrayList内部是通过数组的形式实现的，数组没有空闲时，新增元素是通过新建数组实现
     */
    @Test
    public void testAddAndRemove(){
        List<String> stringList=new ArrayList<>();
        stringList.add("bob");
        stringList.add(0,"sunny");

        logger.info(printList(stringList));
        stringList.add("sam");
        logger.info(stringList.size());
        stringList.remove("sam");
        logger.info(stringList.isEmpty());
        logger.info(stringList.remove(0));
        logger.info(stringList.get(0));
        stringList.add(null);
        stringList.add("bob");

    }

    @Test
    public void testList2Array(){
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        logger.info(printList(list));
        logger.info(Arrays.toString(list.toArray()));
        List<Integer> intList=new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer[] array=intList.toArray(new Integer[7]);
        logger.info(Arrays.toString(array));
    }

    public static String printList(List lists){
        String str="";
        for(Object list:lists){
            str+=" "+list;
        }
        return str;
    }


    @Test
    public void testEquals(){
        List<String> stringList=new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        Assert.assertTrue(stringList.contains("c"));
        assert(stringList.containsAll(stringList));

    }
}
