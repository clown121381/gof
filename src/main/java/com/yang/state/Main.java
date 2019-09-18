package com.yang.state;

/**
 * 多种状态对应多种不同的行为
 */
public class Main {
    public static void main(String[] args) {
        HotelContext con = new HotelContext();
        con.setState(new FreeSate());
    }
}
