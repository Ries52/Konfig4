package org.campus02.stack;

import org.campus02.stack.stackexceptions.StackEmphtieExcepion;
import org.campus02.stack.stackexceptions.StackFullExcepion;

public class IntStackDemo {
    public static void main(String[] args) {
        IntStack intStack= new IntStack(2);
        //int result = intStack.pop();
        //System.out.println(result);
        try {
            intStack.pop();
            intStack.push(4);
            intStack.push(6);
            intStack.push(8);
            intStack.push(8);
            intStack.push(8);
            intStack.push(8);
            intStack.push(8);
        }catch (StackEmphtieExcepion e){
            System.out.println("Stack ist voll");
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
