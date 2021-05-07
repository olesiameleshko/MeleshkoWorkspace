package com.meleshko.homework5.Task3;
import com.olesiameleshko.homework5.Task3.ThirdClass;

//Task 3 package-private
public class SecondClass {

    public SecondClass() {
        FirstClass1 firstClass1 = new FirstClass1();
        ThirdClass thirdClass = new ThirdClass();
        System.out.println(firstClass1.member);
        System.out.println(firstClass1.member1);
        System.out.println(firstClass1.isMember2(true));
    }
}
