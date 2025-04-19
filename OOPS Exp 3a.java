Aim: Write a java program for scanner.


Program:

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter username:");
        
        String username = myObj.nextLine();
        System.out.println("username is :" +username);
    }
}
