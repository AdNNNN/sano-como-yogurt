/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion;

import java.util.List;

/**
 *
 * @author y520
 */
public class Sesion {
    
    private static List<Object> args = null;

    public Sesion() {
    }
    
    public static void createSession(List<Object> args){
         Sesion.args = args;
    }
    
    public static void addArgs(){
        for (Object arg : args) {
            Sesion.args.add(arg);
        }
    }

    public static List<Object> getArgs() {
        return args;
    }

    public static void closeSesion(){
        Sesion.args = null;
    }
    
    public static boolean auth(){
        return (args == null);
    }
}
