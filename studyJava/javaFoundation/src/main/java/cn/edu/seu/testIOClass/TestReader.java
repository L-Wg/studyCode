package cn.edu.seu.testIOClass;

import org.junit.Test;

import java.io.FileReader;

import java.io.IOException;
import java.io.Reader;

/**
 * <code>Reader</code>和<code>InputStream</code>的区别是：
 * 前者是字符流，是以char为单位进行读取；后者是字节流，以byte为单位，此外，两者的读取范围也不一致。
 * 两者关系：Reader本质上是一个基于InputStream的byte到char的转换器
 * <p>
 * @author L_Wang
 */

public class TestReader {
    @Test
    public void testFileReader() throws IOException {

        try(Reader reader=new FileReader("src/main/resources/log4j.properties")){
//          若不设置缓冲区，则使用read()方法读取最大的字节数为65535
//          while (reader.read()!=-1);
            char[] buffer=new char[1024];
            while(reader.read(buffer)!=-1);
//            ..........
        }
    }
}
