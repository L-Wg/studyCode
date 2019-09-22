package cn.edu.seu.testIOClass;

import cn.edu.seu.testCollection.TestProperties;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {
    private static final Logger logger=Logger.getLogger(TestPath.class);

    @Test
    public void testPathMethod(){
        Path path= Paths.get(".", "project", "study");
        logger.info(path);
        logger.info(path.normalize());
        logger.info(path.toAbsolutePath());
        logger.info(path.toFile());
    }

}
