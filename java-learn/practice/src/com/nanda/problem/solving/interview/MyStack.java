package com.nanda.problem.solving.interview;

import java.util.Arrays;

class MyStack
{
    int top;
    int arr[] = new int[1000];

    MyStack()
    {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a)
    {
        ++top;
        arr[top] = a;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {

        if (top == -1) {
           return top;
        } else {
            int num = arr[top];
            --top;
            return num;
        }


    }

//    public static void main(String[] args) {
//        MyStack my = new MyStack();
//
//        my.push(2);
//        my.push(3);
//        my.pop();
//        my.push(4);
//        my.pop();
//
//        System.out.println("done");
//    }
}
