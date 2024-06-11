public class WhatNestedIf {

    public WhatNestedIf() {

    }

    public static void main(String[] args) {

        int number = 7;

        if(number >= 0) {

            if(number == 7)
                System.out.println("This is Christiano Ronaldo!");
            else
                System.out.println("This is another player.");
                
        } else {
            System.out.println("Negative number!!!");
        }
    }
}