//Task 3 package-private
package com.olesiameleshko.homework5.Task3;
import com.meleshko.homework5.Task3.SecondClass;

public class ThirdClass {

    public ThirdClass() {
        //FirstClass1 firstClass1 = new FirstClass1(); //FirstClass1()' is not public in 'com.meleshko.homework5.Task3.FirstClass1'. Cannot be accessed from outside package
        SecondClass secondClass = new SecondClass();
        //System.out.println(firstClass1.member); //'member' is not public in 'com.meleshko.homework5.Task3.FirstClass1'. Cannot be accessed from outside package
        //System.out.println(firstClass1.member1); //'member1' is not public in 'com.meleshko.homework5.Task3.FirstClass1'. Cannot be accessed from outside package
        //System.out.println(firstClass1.isMember2()); //'isMember2(boolean)' is not public in 'com.meleshko.homework5.Task3.FirstClass1'. Cannot be accessed from outside package
    }
}