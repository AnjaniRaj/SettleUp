package training.practice;

import java.util.Scanner;

public class CliImp {
    public static void main(String[] args) {
        String username;
        getUser();
        User u1= new User("Anjani");
        User u2 = new User("Chris");
        System.out.println(u1+"  "+u2);
        Group g1= new Group(new User[]{u1,u2},"TestGroup");
        System.out.println(g1);
        g1.addTxns(new Transaction(20,u1));//todo: test with negative amount
        System.out.println(g1);
        System.out.println(g1.getMap().get(u1)[0]);
        System.out.println(g1.getMap().get(u1)[1]);
    }

    private static void getUser() {

        System.out.println("Enter usernamme ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
    }
}
