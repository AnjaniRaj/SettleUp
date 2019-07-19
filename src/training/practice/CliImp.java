package training.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CliImp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	while(true) {
    		System.out.println("1. Enter User \t 2. Enter New Group \t 3. Enter New Transaction \t 4. Exit");
    		Scanner in = new Scanner(System.in);
    		int choice = Integer.parseInt(in.nextLine());
    		HashSet<User> set = new HashSet<>();
            Group g1 = new Group();
    		switch(choice) {
    		case 1:
    			User u1 = new User(getUser());
    			System.out.println("Created [" + u1 + "] successfully");
    			storeUserSer(u1);
    			break;
    		case 2:
    			String userName;
    			System.out.println("Enter users and enter q for exiting : ");
    			while(true) {
    				userName = in.nextLine();
    				if(userName.compareTo("q")!=0) {
    					User u = getUserFromArrayList(userName);
    					set.add(u);
    				}
    				else {
    					break;
    				}
    			}
    			g1 = new Group(set, getGroup());
    			System.out.println(g1);
    			break;
    		case 3:
   			    g1.addTxns(new Transaction(getTransactionAmount(), getUserFromArrayList(getUser())));
    			break;
    		case 4:
    			System.exit(0);
    		default :
    			System.out.println("Wrong Input");;
    		}
    	}
    }

    public static User getUserFromArrayList(String userName) throws ClassNotFoundException, IOException {
    	ArrayList<User> user = getUserSer();
    	for(User temp : user) {
    		if(temp.getName().compareTo(userName) != 0)
    		{
    			return temp;
    		}
    	}
    	return null;
    }

    private static ArrayList<User> getUserSer() throws IOException {
        File file = new File("users.ser");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        User user;
        ArrayList<User> users=new ArrayList<>();
        try {
            while(true){
                user= (User) ois.readObject();
                users.add(user);
            }
        }catch (EOFException e){
            //System.out.println("succesfully read");
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    private static void storeUserSer(User user) throws IOException {
        File file = new File("users.ser");
        ObjectOutputStream oos;
        if(file.exists()) {
            oos = new AppendingObjectOutputStream(new FileOutputStream(file,true));
            System.out.println("existing file");
        }else{
            oos= new ObjectOutputStream(new FileOutputStream(file));
            System.out.println("creating a file");
        }

        oos.writeObject(user);
        oos.close();

        System.out.println("User data serialized");
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
