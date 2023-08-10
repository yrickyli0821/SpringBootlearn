package com.atyaocheng.boot.bean;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

@lombok.Data
public class Person {
    private String name;
    private Integer age;
    private Data birthDay;
    private Boolean like;
    private List<Dog> dogs;
    private Map<String, Cat> cats;
}
