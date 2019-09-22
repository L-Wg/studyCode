package cn.edu.seu.testIOClass;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestInputStream {
    private static final Logger logger=Logger.getLogger(TestInputStream.class);

    /**
     * 这种写法在读取中，若发生IO错误，就无法close inputStream，资源无法正常释放
     * @throws IOException
     */
    @Test
    public void testReadFile() throws IOException {
        InputStream inputStream=new FileInputStream(".\\src\\main\\resources\\log4j.properties");
        int n;
        while((n=inputStream.read())!=-1){
            System.out.println(n);
        }
        inputStream.close();
    }

    /**
     *
     * @throws IOException
     */

    @Test
    public void testReadFile1() throws IOException {
        InputStream inputStream=null;

        try {
            inputStream=new FileInputStream(".\\src\\main\\resources\\log4j.properties");
            int n;
            while((n=inputStream.read())!=-1){
                System.out.println(n);
            }
        } finally {
            if(inputStream!=null){
                inputStream.close();
            }
        }
    }

    /**
     * 这种方式是Java1.7版本引进，和<code>testReadFile1</code>中写法比较，可以简化代码.
     * @throws IOException
     */
    @Test
    public void testReadFile2() throws IOException {
       try(InputStream inputStream=new FileInputStream(".\\src\\main\\resources\\log4j.properties")){
           int n;
           while((n=inputStream.read())!=-1){
               System.out.println(n);
           }
       }
    }

    /**
     * read(byte[])其实内部是调用的read(byte[],int offset,int len)
     * @throws IOException
     */
    @Test
    public void testRead3() throws IOException {
        try(InputStream inputStream=new FileInputStream(".\\src\\main\\resources\\log4j.properties")){
            byte[] buffer=new byte[1024];
            int n;
            while((n=inputStream.read(buffer))!=-1){
                System.out.println("read "+n+" bytes.");
            }
        }
    }


}
