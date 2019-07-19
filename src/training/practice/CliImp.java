package training.practice;

import java.util.Scanner;

public class CliImp {
    public static void main(String[] args) {

        User u1= new User(getUser());
        User u2 = new User(getUser());
        System.out.println(u1+"  "+u2);

        Group g1= new Group(new User[]{u1,u2},getGroup());
        System.out.println(g1);

        g1.addTxns(new Transaction(getTransactionAmount(),u1));
        System.out.println(g1);
        System.out.println(g1.getMap().get(u1)[0]);
        System.out.println(g1.getMap().get(u1)[1]);

    }

    private static double getTransactionAmount() {
        System.out.println("Enter Transaction Amount ");
        Scanner scanner = new Scanner(System.in);
        double i = Double.parseDouble(scanner.nextLine());
        if (i<0) {
            System.out.println("Amount cannot be negative");
        }else return i;
        return 0;
    }

    private static String getUser() {

        System.out.println("Enter usernamme ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        return username;
    }
    private static String getGroup() {

        System.out.println("Enter Group name ");
        Scanner scanner = new Scanner(System.in);
        String groupname = scanner.nextLine();
        return groupname;
    }
}
