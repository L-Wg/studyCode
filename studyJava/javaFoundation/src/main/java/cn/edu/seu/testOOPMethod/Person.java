package cn.edu.seu.testOOPMethod;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Person {
    private final static Logger logger=Logger.getLogger(Person.class);

    private String[] nameArray;
    private String name;

    public String getNameArray() {
        String names="";
        for(String name:nameArray){
            names+=" "+name;
        }
        return names;
    }

    public void setNameArray(String[] nameArray) {
        this.nameArray = nameArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * 针对testArrayPara()方法中，fullName[0]传递的是一个String对象的引用，
     * 而该引用又是对应字符串Homer的引用，类似下图
     *  setNameArray()中nameArray[0]
     *                  |
     *                 \/
     * fullName[0]->String->Homer
     * 所以当fullName[0]的指向的值改变时，String对象被改变时，指向其的所有值都将被改变
     */
    @Test
    public void testArrayPara(){
        Person person=new Person();
        String[] fullName={"Homer", "Simpson"};
        person.setNameArray(fullName);
        logger.info(person.getNameArray());     //Homer Simpson
        fullName[0]="bob";
        logger.info(person.getNameArray());     //bob Simpson
    }

    /**
     * setName()与testStringPara()方法中的name指向的是String对象"bob"，
     * 改变其中一个不影响另一个
     */
    @Test
    public void testStringPara(){
        Person person=new Person();
        String name="bob";
        person.setName(name);
        logger.info(person.getName());      //bob
        name="Alice";
        logger.info(person.getName());      //bob
    }
}
