package com.yang.flyweight;

//
public interface ChessFlyWeight {
    //内部共享状态
    void setColor(String color);
    String getColor();
    //外部非共享状态
    void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight{

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色"+color);
        System.out.println("棋子位置x:y"+c.getX()+c.getY());
    }

}