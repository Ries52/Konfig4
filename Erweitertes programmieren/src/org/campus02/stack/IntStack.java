package org.campus02.stack;

import org.campus02.stack.stackexceptions.StackEmphtieExcepion;
import org.campus02.stack.stackexceptions.StackFullExcepion;

public class IntStack {

    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws StackFullExcepion, StackEmphtieExcepion {

        if (pointer== stack.length-1){
           throw new StackFullExcepion("Stack ist bereits voll");
        }
        pointer++;
        stack[pointer]= value;
    }
    public int pop() throws Exception{
        if (pointer== -1){
            throw new StackEmphtieExcepion("Stack ist leer");
        }
        int actualValue= stack[pointer];
        stack[pointer]=0;
        pointer--;
        return actualValue;
    }
}
