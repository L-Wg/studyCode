package cn.edu.seu.testIOClass;


import org.junit.Test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class TestOutputStream {


    @Test
    public void testWrite() throws IOException {
        try(OutputStream outputStream=new FileOutputStream(".\\outTest.txt")){
            outputStream.write("hello".getBytes("UTF-8"));
        }
    }
}
