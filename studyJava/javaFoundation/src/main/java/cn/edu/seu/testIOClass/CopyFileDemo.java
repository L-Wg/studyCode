package cn.edu.seu.testIOClass;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyFileDemo {

    private static String inputFile = CopyFileDemo.class.getClassLoader().getResource("log4j.properties").getPath();
    private static String outputFile = ".\\demoOut.txt";

    public static void main(String[] args) throws IOException {

        System.out.println(new File(".").getCanonicalPath());
        try (InputStream inputStream = new FileInputStream(inputFile);
             OutputStream outputStream = new FileOutputStream(outputFile)) {

//            通过这三方式，都可以讲文件实现拷贝，但是各有优缺点
//            方法一：指定byte数组为1M，若小于1M，但文件大小还是1M，文件中最后是NULL填充；
//            方法二、三：length是返回long类型，要进行类型转换；available返回是int，存在输入流大小
//            超过int范围的情况
//            byte[] bytes=new byte[1024*1024];
//            byte[] bytes=new byte[(int)new File(inputFile).length()];
            byte[] bytes = new byte[inputStream.available()];
            while (inputStream.read(bytes) != -1) {
                outputStream.write(bytes);
            }


        }
    }

    /**
     * 安装下面这种写法是没有问题的，但是还是需要分配一个buffer
     *
     * @throws IOException
     */

    @Test
    public void testCopy() throws IOException {

        try (InputStream inputStream = new FileInputStream(inputFile);
             OutputStream outputStream = new FileOutputStream(outputFile)) {
            FileChannel inChannel = ((FileInputStream) inputStream).getChannel();
            FileChannel outChannel = ((FileOutputStream) outputStream).getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024);
            while (inChannel.read(buffer) != -1) {
                buffer.flip();
                outChannel.write(buffer);
                buffer.clear();
            }

        }

    }

    @Test
    public void testCopy1() throws IOException {
        try (InputStream inputStream = new FileInputStream(inputFile);
             OutputStream outputStream = new FileOutputStream(outputFile)) {
            FileChannel inChannel = ((FileInputStream) inputStream).getChannel();
            FileChannel outChannel = ((FileOutputStream) outputStream).getChannel();

            inChannel.transferTo(0,inChannel.size(),outChannel);
        }


    }
}
