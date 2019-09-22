package cn.edu.seu.testJunit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

//1、将测试运行器改为Parameterized.class
@RunWith(Parameterized.class)
public class TestParametersMethod {
//2、声明变量来保存参数和预期值
    int expected=0;
    int input1=0;
    int input2=0;

//3、要有个public的构造函数
    public TestParametersMethod(int expected,int input1,int input2){
        this.expected=expected;
        this.input1=input1;
        this.input2=input2;
    }
//4、返回值为公共的static的Collection方法，并使用@Parameters进行修饰。
    @Parameterized.Parameters
    public static Collection<Object[]> test(){
        return Arrays.asList(new Object[][]{{3,1,2},{4,2,2}});
    }
//在类中使用@Test标识要测试的方法。
    @Test
    public void testAdd(){
        Assert.assertEquals(expected,input1+input2);
    }
}
