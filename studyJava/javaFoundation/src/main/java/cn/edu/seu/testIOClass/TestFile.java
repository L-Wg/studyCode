package cn.edu.seu.testIOClass;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestFile {
    private static final Logger logger=Logger.getLogger(TestFile.class);

    @Test
    public void testInit(){
        File file=new File("D:\\download");
        Assert.assertTrue(file.isDirectory());
        logger.info(file);
        logger.info(File.separator);
        logger.info(File.separatorChar);
        logger.info(File.pathSeparatorChar);
    }

    @Test
    public void testGetPath() throws IOException {
        File file=new File(".");
        logger.info(file.getPath());
        logger.info(file.getAbsolutePath());
        logger.info(file.getCanonicalPath());
    }

    @Test
    public void testCreateAndDel() throws IOException {
        File file=new File("./test.txt");
        if(file.createNewFile()){
            logger.info("create new file!");
        }
        logger.info(file.length());
        Assert.assertTrue(file.isFile());
        Assert.assertTrue(file.canRead());
        Assert.assertTrue(file.canWrite());
        Assert.assertTrue(file.canExecute());
        file.delete();

        File temFile=File.createTempFile("tmp-",".txt");
        logger.info(temFile.getCanonicalPath());
        temFile.deleteOnExit();
    }

    @Test
    public void testTraverse() throws IOException {
        File file=new File("..");
        File[] files=file.listFiles();
        printFiles(files);

    }

    private static void printFiles(File[] files) throws IOException {
        System.out.println("**************");
        if(null==files){
            logger.info("files is empty!");
            return;
        }
        for(File f:files){
            System.out.println(f.getCanonicalPath()+"  VS   "+f.getAbsolutePath());
        }
    }


    @Test
    public void testMkdir() throws IOException {
        File file=new File("./test");
        file.mkdir();
        Assert.assertTrue(file.isDirectory());
        Assert.assertTrue(file.canWrite());
        Assert.assertTrue(file.exists());
        logger.info(file.getCanonicalPath());
        file.delete();

    }
}
