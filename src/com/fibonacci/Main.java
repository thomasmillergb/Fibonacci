package com.fibonacci;

public class Main {

    public static void main(String[] args) {
        //int x = fib(6,1,0);
        int x = fib(6);
        System.out.println(x);
    }

    public static int fib(int term, int val, int prev)
    {
        if(term == 0) return prev;
        if(term == 1) return val;
        System.out.println(val);
        System.out.println(prev);
        return fib(term - 1, val+prev, val);
    }
    public static int fib(int i ){
      int next = 1, prev = 0, val =0;

      while(i!=0){
          i--;
          int temp = next;
          next = next + prev;
          prev = temp;

      }
        return prev;
    }

}

