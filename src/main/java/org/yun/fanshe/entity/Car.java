package org.yun.fanshe.entity;

import lombok.*;

/**
 * @ClassName User
 * @Author 芸
 * @Date 2020/2/25 13:39
 * @Description TODO
 **/
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car extends User{

    private String name;
    private Integer age;
    public String color;
    public String test1;
    public String test2;


    private class MainPrivate {
    }

    public class MainPublic {
    }
}


