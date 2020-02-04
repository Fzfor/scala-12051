package com.atguigu.bigdata.scala.test;

/**
 * Create by fz on 2020/2/4
 */

public class Example {
    private class InsideClass implements InterfaceTest {
        public void test() {
            System.out.println("这是一个测试");
        }

        @Override
        public void increment() {

        }
    }

    public InterfaceTest getIn() {
        return new InsideClass();
    }
}
