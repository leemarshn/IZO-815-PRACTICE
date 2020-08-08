package com.company.util;

import java.util.Formatter;

public class Formatter1 {
    public static void main(String[] args) {
        Formatter	fmt	=	new Formatter();
        Students student = new Students();
        student.setId(222422222);
        student.setName("Lee N");
        student.setPhone(787845454);

        String nm = student.getName();
        int pn = student.getPhone();
        long id = student.getId();

       fmt.format("%s his id no: %d and phone number %d", nm, id, pn);

//        fmt.format("Formatting	%s	is	easy	%d	%f",	"with	Java",	10,	98.6);
        System.out.println(fmt);
        fmt.close();
    }
}
