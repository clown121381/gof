package com.yang.prototype;

public class TestClone {
    public void test1() throws CloneNotSupportedException {
        Ship ship = new Ship("多利", 3, "0x001");
        System.out.println(ship);

        Ship ship1 = ship.clone();
        System.out.println(ship == ship1);
        ship1.setName("少丽");
        System.out.println(ship1);
        System.out.println(ship);
    }
}
