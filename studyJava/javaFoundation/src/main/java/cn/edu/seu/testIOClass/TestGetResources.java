package cn.edu.seu.testIOClass;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * <code>getResourceAsStream</code>若不加 / ，则是从当前类所在目录开始寻找文件；
 * 若加 / ，则从classpath的根下查找，即从本工程的根目录查看文件。
 * @author L_Wang
 */

public class TestGetResources {
    @Test
    public void testGetPropertoes() throws IOException {
        try(InputStream configFile=getClass().getResourceAsStream("/log4j.properties")){
            if(configFile!=null){
                System.out.println("get properties file sucessfully!");
            }

        }
    }
}
