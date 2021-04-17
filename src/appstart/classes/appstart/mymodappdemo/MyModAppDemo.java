package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;
import java.util.ServiceLoader;
import userfuncs.binaryfuncs.BinFuncProvider;
import userfuncs.binaryfuncs.BinaryFunc;

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

        System.out.println("Демонстрація постачальників послуг…");

        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);
        BinaryFunc binOp = null;

        for (BinFuncProvider bfp : ldr) {
            // от для цього ми маємо у module-info.java для appstart
            // об'явити userfuncs.binaryfuncs.BinFuncProvider
            // інакше будемо мати виключення:
            // userfuncs.binaryfuncs.BinFuncProvider: module appstart does not declare `uses`
            System.out.println(bfp.get().getName());

            if (bfp.get().getName().equals("AbsPlus")) {
                binOp = bfp.get();
                break;
            }
        }

        if (binOp != null) {
            System.out.println(
                    "Результат виконання функції absPlus(12, -4):"
                    + binOp.func(12, -4)
            );
        } else {
            System.out.println("Функції absPlus() не знайдено!");
        }

        binOp = null;

        for (BinFuncProvider bfp : ldr) {
            System.out.println(bfp.get().getName());

            if (bfp.get().getName().equals("AbsMinus")) {
                binOp = bfp.get();
                break;
            }
        }

        if (binOp != null) {
            System.out.println(
                    "Результат виконання функції AbsMinus(12, -4):"
                    + binOp.func(12, -4)
            );
        } else {
            System.out.println("Функції AbsMinus() не знайдено!");
        }

    }
}
