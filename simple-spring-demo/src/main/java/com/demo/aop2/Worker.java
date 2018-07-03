package com.demo.aop2;

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
