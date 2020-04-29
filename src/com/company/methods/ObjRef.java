package com.company.methods;

public class ObjRef {

    public static void main(String args[]) {
        APByReferenceTest ob = new APByReferenceTest(15, 20);

        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);
        System.out.println(ob.div(ob));
    }
}
