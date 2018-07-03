/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author Duc
 */
public class LogSWD {

    public static void e(String error) {
        System.out.println("SWD Error:" + error);
    }

    public static void i(String info) {
        System.out.println("SWD Info:" + info);
    }

    public static void d(String debug) {
        System.out.println("SWD Debug:" + debug);
    }
}
