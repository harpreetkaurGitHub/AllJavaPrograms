package com.company.exceptionHandling.Throws;

public class ConstructorThrows {

    String name = null;
    String ID = null;

    ConstructorThrows(String abc) {
        System.out.println(abc);
    }

    ConstructorThrows() throws Exception {
            if (name.equals("happy")) {
                System.out.println("Bravoooo....");
            }
            else {
                System.out.println("OHH NOOOO...");
            }

    }
    public static void main(String[] args) {
        try {
            System.out.println("");
            ConstructorThrows obj = new ConstructorThrows();
        }
        catch (Exception e) {
            e.printStackTrace();

            System.out.println("Catched");
        }

    }
}

// TODO: 03-06-2020
//  1. Compile time exception.                                                             DONE
//  2. runtime exception,code and exception names meaning.                                 DONE
//  3. error code and theory(types).                                                       DONE
//  4. throw and throws(with code).                                                        DONE
//  5. Custom exception(" ").                                                              DONE
//  6. try catch(all senarios).                                                            DONE
//  7. ducking exception code.                                                             DONE
//  8. catched exception.                                                                  DONE