package com.company.Oops.constructor.Parameterised;
import com.company.Oops.Access.Parameterised;

public class ParameterConstQs extends Parameterised {
    ParameterConstQs() {
        super(12,43);
        System.out.println("Hi i am accessed class from anther package");
    }
    private void Parameterised() {
    }

    public static void main(String[] args) {
        ParameterConstQs Qs = new ParameterConstQs();

        Qs.Parameterised();
    }
}
