package cn.edu.seu.testCollection;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    private static final Logger logger=Logger.getLogger(TestCollections.class);

    @Test
    public void testInit(){
        List<String> list= Collections.emptyList();
        List<String> list1=Collections.EMPTY_LIST;
        List<String> list2=new ArrayList<>();
        list.add("a");
        list1.add("b");
        list2.add("c");
    }

    /**
     * sort()方法会改变list本身
     */
    @Test
    public void testSort(){
        List<String> list=new ArrayList<>();
        list.add("d");
        list.add("a");
        list.add("b");
        list.add("c");
        logger.info(list);
        Collections.sort(list);
        logger.info(list);
    }

    /**
     * 修改原始的list会对immutable的list进行了修改，建议舍弃对list的引用。
     */
    @Test
    public void testUnmodifiableMethod(){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        List<String> immutable=Collections.unmodifiableList(list);
//        immutable.add("c");
        logger.info(immutable);
        list.add("c");
        logger.info(immutable);
    }
}
