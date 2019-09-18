package com.yang.flyweight;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyweightFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color){
        if(map.get(color)!= null){
            return map.get(color);
        }else{
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }

}
