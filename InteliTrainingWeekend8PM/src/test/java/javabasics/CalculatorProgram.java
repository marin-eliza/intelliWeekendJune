package javabasics;

public class CalculatorProgram {

    public static void main(String[] args) {

        // input

        double inputOne =  56.78;
        double inputTwo = 90 ;

        String operator = "-";
        //operation + - * / --> input provide by the user

        double output = 0;

        if(operator.equals("+")){

            output = inputOne + inputTwo ;

        }
        else if (operator.equals("-")) {

            if(inputOne > inputTwo){

                output = inputOne - inputTwo ;

            }
            else{
                output = inputTwo - inputOne ;
            }

        }

        else if (operator.equals("/")){

            if(inputOne != 0 && inputTwo !=0){

                output = inputOne/inputTwo;
            }
            else{
                System.out.println("Divison cann't be perform");
            }

        }

        else{

            System.out.println("enter valid operator");
        }

        System.out.println(output);

    }
}
