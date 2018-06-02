package com.demo.aop_test;

/**
 * @author junhong
 */
public interface Worker {

    void add(String name);

    void print();

    String get();

    String getWithRuntimeExecption();

    // String getWithExecption() throws Exception;

    String getWithCustomException();

}
