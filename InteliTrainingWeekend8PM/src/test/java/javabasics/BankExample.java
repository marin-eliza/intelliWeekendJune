package javabasics;

public class BankExample {

    public static void main(String[] args) {

        // role - Manager - 500, Staff - 300 , Clerk - 200
        // inputs - role , no of working days

        String role = "clerk";
        int noOfWorkingDays = 10 ;
        int salary = 0;

        if(role.equalsIgnoreCase("manager")){

            salary = 500 * noOfWorkingDays ;

        }

        else if (role.equalsIgnoreCase("staff")){

            salary = 300 * noOfWorkingDays ;

        }
        else if(role.equalsIgnoreCase("Clerk")){

            salary = 100 * noOfWorkingDays ;

        }
        else {

            System.out.println("Enter the valid role");

        }

        System.out.println(salary);

    }
}
