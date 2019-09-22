package cn.edu.seu.testJunit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestMethod1.class,TestMethod2.class,TestMethod3.class})

public class TestJunitSuit {
}
