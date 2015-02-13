package com.springapp.helpers.lambdaCompilerHelper;

import java.lang.invoke.*;

/**
 * Created by Internet on 2015-02-12.
 */
public class EntityInstanceCallSite {
    private StringBuilder resultHibernateSQL;
    public static final int _OR = 0;
    public static final int _AND = 1;

    public EntityInstanceCallSite(){
        this.resultHibernateSQL = new StringBuilder();
    }

    private static void printArgs(Object... args) {
        System.out.println(java.util.Arrays.deepToString(args));
    }
    private static final MethodHandle printArgs;
    static {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        Class thisClass = lookup.lookupClass();
        printArgs = lookup.findStatic(thisClass,
                "printArgs", MethodType.methodType(void.class, Object[].class));
        ImpliesOp im = new ImpliesOp(runnable -> ;


    }


    private static CallSite bootstrapDynamic(MethodHandles.Lookup caller, String name, MethodType type) {
        return new ConstantCallSite(printArgs.asType(type));
    }
}
