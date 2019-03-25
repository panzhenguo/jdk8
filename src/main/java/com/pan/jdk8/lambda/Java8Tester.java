package com.pan.jdk8.lambda;

/**
 * @ClassName Java8Tester
 * @Description lambda 学习
 * @Author pzg
 * @Date 2019/3/25 15:39
 * @Version 1.0.0
 */
public class Java8Tester {
    interface MathOperation {
        int operation(int a, int b);
    }
    interface GreetingService {
        void sayMessage(String message);
    }

    public static void main(String args[]){

        Java8Tester tester = new Java8Tester();

        /**
         * 定义接口方法体
         */
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        MathOperation division = (int a, int b) -> a / b;


//        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
//        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
//        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
//        System.out.println("10 / 5 = " + tester.operate(10, 5, division));





        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }


    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
