/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;

/**
 *
 * @author olden
 */
public class MyModAppDemo {

    public static void main(String[] args) {

        if (SupportFuncs.isFactor(2, 10)) {
            System.out.println("2 - множник 10");
        }

        System.out.println("Найменший множник 35 та 105: " + SimpleMathFuncs.lcf(35, 105));
        System.out.println("Найбільший множник 35 та 105: " + SimpleMathFuncs.gcf(35, 105));
    }
}
