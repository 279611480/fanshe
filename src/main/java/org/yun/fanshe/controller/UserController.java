package org.yun.fanshe.controller;

import org.junit.Test;
import org.yun.fanshe.entity.Car;
import org.yun.fanshe.entity.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName UserController
 * @Author 芸
 * @Date 2020/2/25 13:41
 * @Description TODO
 **/
public class UserController {

    //获取类的对象属性
    @Test
    public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        //获取类对象
        Class<?> user1 = Class.forName("org.yun.fanshe.entity.User");
        User user2 = new User();
        Class<User> user3 = User.class;
        //通过类的加载器获取类对象
        ClassLoader classLoader = User.class.getClassLoader();
        Class clazz = classLoader.loadClass("org.yun.fanshe.entity.User");


 /***********************************获取类中的对象属性*******************************************/
        //1------全限名  user2,不是 是因为，已经是实例对象了
//        System.out.println("1--" + user1);
//        System.out.println("2--" + user2);
//        System.out.println("3--" + user3);
//        System.out.println("4--" + clazz);

        //2------获取全限名
//        System.out.println("1--" + user1.getName());
//        System.out.println("2--" + user2.getName());
//        System.out.println("3--" + user3.getName());
//        System.out.println("4--" + clazz.getName());

//        获取所有字段对象
//        Field[] userFieds = user1.getDeclaredFields();
//        for (Field userFied : userFieds) {
//            System.out.println(userFied);
//        }
//        //获取单个属性对象
//        Field userName = user1.getDeclaredField("name");
//        System.out.println(userName);
//        //获取所有公开属性对象
//        Field[] fields = user1.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
//        //获取单个公开属性对象
//        Field test1 = user1.getField("test1");
//        System.out.println(test1);



        //3------实例化
//        System.out.println("1--" + user1.newInstance());
//        System.out.println("3--" + user3.newInstance());
//        System.out.println("4--" + clazz.newInstance());
        //4------实例化，获取值 OR 设置值
//        User user11 = (User) user1.newInstance();
//        User user33 = (User) user3.newInstance();
//        User user44 = (User) clazz.newInstance();
//        user11.setName("芸芸众生");
//        user11.setAge(18);
//        user11.setSing("在唱歌");
//        System.out.println(user11.getName());
//        System.out.println(user11.toString());
    }

    //获取类属性
    @Test
    public void test2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> user1 = Class.forName("org.yun.fanshe.entity.User");
        System.out.println("获得类的加载器" + user1.getClassLoader());

        System.out.println("User--返回一个数组，数组中包含该类中所有公共类和接口类的对象" + Arrays.toString(User.class.getClasses()));
        System.out.println("Car--返回一个数组，数组中包含该类中所有公共类和接口类的对象" + Arrays.toString(Car.class.getClasses()));
        System.out.println("User--返回一个数组，数组中包含该类中所有类和接口类的对象" + Arrays.toString(User.class.getDeclaredClasses()));
        System.out.println("Car--返回一个数组，数组中包含该类中所有类和接口类的对象" + Arrays.toString(Car.class.getDeclaredClasses()));

        System.out.println("获得类的完整路径名字" + user1.getName());
        System.out.println("实例化" + user1.newInstance().toString());
        System.out.println("获取包名" + user1.getPackage());
        System.out.println("获取类名" + user1.getSimpleName());
        System.out.println("获取当前类继承的父类名" + Car.class.getSuperclass());
        //getInterfaces()	获得当前类实现的类或是接口

    }

    //获得类中构造器相关的方法
    @Test
    public void test3() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> user1 = Class.forName("org.yun.fanshe.entity.User");
        //获取该类所有的构造器方法
        Constructor<?>[] declaredConstructors = user1.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //获得该类中与参数类型匹配的构造方法
        Constructor<?> declaredConstructor = user1.getDeclaredConstructor(String.class, Integer.class, String.class,String.class, String.class,String.class);
        System.out.println("获得该类中与参数类型匹配的构造方法" + declaredConstructor);
        //获得该类的所有公有构造方法
        System.out.println("获得该类的所有公有构造方法" + user1.getConstructors());
        //获得该类中与参数类型匹配的公有构造方法
        System.out.println("获得该类中与参数类型匹配的公有构造方法" + user1.getConstructor());
        System.out.println("获得该类中与参数类型匹配的公有构造方法" + user1.getConstructor(String.class, Integer.class, String.class,String.class, String.class,String.class));

    }

    //获得类中方法相关的方法
    @Test
    public void test4() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<?> user1 = Class.forName("org.yun.fanshe.entity.User");

        //获得该类所有方法
//        Method[] declaredMethods = user1.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }

        //获得该类某个方法  以及使用它
//        Method declaredMethod = user1.getDeclaredMethod("setName", String.class);//setNmae方法
////        declaredMethod.setAccessible(true);
//        User objectUser = (User)user1.newInstance();//创建对象
//        Object invoke = declaredMethod.invoke(objectUser, "芸芸众生");//objectUser调用declaredMethod方法   参数：类，值
//        System.out.println(objectUser.getName());

        //获取所有的公共方法
//        Method[] method = user1.getMethods();
//        for (Method method1 : method) {
//            System.out.println(method1);
//        }

        //获取某个公共方法以及使用
//        Method setAge = user1.getMethod("setAge", Integer.class);
//        User user = (User) user1.newInstance();
//        setAge.invoke(user,18);
//        System.out.println(user.getAge());
    }

}
