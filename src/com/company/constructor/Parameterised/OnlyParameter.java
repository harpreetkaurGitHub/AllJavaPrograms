package com.company.constructor.Parameterised;

public class OnlyParameter {
        private int var;
        public OnlyParameter(int num)
        {
            var=num;
        }
        public int getValue()
        {
            return var;
        }
        public static void main(String args[])
        {
            OnlyParameter myobj = new OnlyParameter(12);
            System.out.println("value of var is: "+myobj.getValue());
        }
    }

