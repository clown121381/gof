package com.yang.strategy;

/**
 * 策略模式
 * 发杂场景经组合出策略
 * 解决某一个问题的算法族
 * 准许用户从该算法中选择一个算法解决问题，
 * 同时可以增加或者更换算法
 *
 * Spring中的Resource接口，资源访问策略
 *
 * javax.servelt.http.HttpServlet # service();
 */
public class Main {
    public static void main(String[] args) {

        Stratey s1 = new OldCustomerManyStratey();
        Context con = new Context(s1);
        con.printPrice(998);
    }
}
