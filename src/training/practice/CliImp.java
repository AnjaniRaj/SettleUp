package training.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CliImp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User u1= new User(getUser());
        User u2 = new User(getUser());
        User u3 = new User(getUser());
        System.out.println(u1+"  "+u2);

        storeUserSer(u1);
        storeUserSer(u2);

        ArrayList<User> userArrayList = getUserSer();
        System.out.println(userArrayList);

        Group g1= new Group(new User[]{u1,u2,u3},getGroup());
        g1.addTxns(new Transaction(getTransactionAmount(),u1));

        System.out.println(g1);

    }

    private static ArrayList<User> getUserSer() throws IOException, ClassNotFoundException {
        File file = new File("users.ser");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        User user;
        ArrayList<User> users=new ArrayList<>();
        try {
            while(true){
                user= (User) ois.readObject();
                users.add(user);
                System.out.println(user);
            }
        }catch (EOFException e){
            System.out.println("succesfully read");
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
