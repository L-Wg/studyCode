package cn.edu.seu.testIOClass;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * 测试两方法是需要指定相应文件，参考链接如下
 * @author L_Wang
 *
 * <link>https://www.liaoxuefeng.com/wiki/1252599548343744/1298366336073762#0</link>
 *
 */
public class TestZipOperator {
    private static final Logger logger=Logger.getLogger(TestZipOperator.class);


    @Test
    public void testReadZip() throws IOException {
        try(ZipInputStream zipInputStream=new ZipInputStream(new FileInputStream(""))){
            ZipEntry zipEntry=null;
            while((zipEntry=zipInputStream.getNextEntry())!=null){
//                String name=zipEntry.getName();
                if(!zipEntry.isDirectory()){
                    logger.info(zipEntry.getName()+" is file and will to print bytes");
                    int count=0;
                    while (zipInputStream.read()!=-1){
                        count++;
                    }

                    logger.info("the total bytes in the file is "+count);
                }

            }
        }
    }

    @Test
    public void testWriteZip() throws IOException {
        try(ZipOutputStream zipOutputStream=new ZipOutputStream(new FileOutputStream(""))){
            File[] files=new File[]{new File(""),new File("")};
            for(File file:files){
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                zipOutputStream.write(getFileDataAsBytes(file));
                zipOutputStream.closeEntry();
            }

        }
    }

    private static byte[] getFileDataAsBytes(File file) throws IOException {

        byte[] bytes=new byte[1024];
        try(InputStream inputStream=new FileInputStream(file)){
            while (inputStream.read(bytes)!=-1);
        }
        return bytes;
    }
}
