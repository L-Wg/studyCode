package cn.edu.seu.testIOClass;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试FilterInputStream
 * @author L_Wang
 */

public class TestFilter {

    public static class CountInputStream extends FilterInputStream{

        private int count;

        /**
         * Creates a <code>FilterInputStream</code>
         * by assigning the  argument <code>in</code>
         * to the field <code>this.in</code> so as
         * to remember it for later use.
         *
         * @param in the underlying input stream, or <code>null</code> if
         *           this instance is to be created without an underlying stream.
         */
        protected CountInputStream(InputStream in) {
            super(in);
        }

        public int getBytesCount(){
            return this.count;
        }

        public int read() throws IOException {
            int n=in.read();
            if(n!=-1){
                this.count++;
            }
            return n;
        }

    }
//输出读取的字节个数
    @Test
    public void mainMethod() throws IOException {
        byte[] bytes="hello world".getBytes("UTF-8");
        try(CountInputStream countInputStream=new CountInputStream(new ByteArrayInputStream(bytes))){

            while ( countInputStream.read()!=-1);

            System.out.println(countInputStream.getBytesCount());
        }
    }
}
