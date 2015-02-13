package com.springapp.helpers.lambdaCompilerHelper;

/**
 * Created by Internet on 2015-02-13.
 */
public class ImpliesOp {
    String name = "Yagiz";

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Name is " + name);
        }
    };
}
