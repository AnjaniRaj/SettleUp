package training.practice;

import java.util.HashSet;
import java.util.Scanner;

import training.day4.collectionns.Device;

public class CliImp {
    public static void main(String[] args) {
    	while(true) {
    		System.out.println("1. Enter User \t 2. Enter New Group \t 3. Enter New Transaction \t 4. Exit");
    		Scanner in = new Scanner(System.in);
    		int choice = Integer.parseInt(in.nextLine());
    		HashSet<User> set = new HashSet<>();
    		switch(choice) {
    		case 1:
    			User u1 = new User(getUser());
    			System.out.println("Created [" + u1 + "] successfully");
    			break;
    		case 2:
    			String userName;
    			System.out.println("Enter users and enter q for exiting : ");
    			while(true) {
    				userName = in.nextLine();
    				User u = _______________;
    				set.add(u);				
    			}
    			Group g1 = new Group(set, getGroup());
    			System.out.println(g1);
    			break;
    		case 3:
    			g1.addTxns(new Transaction(getTransactionAmount(), getUserSer(getUser())));;    			
    		}
    	}
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
