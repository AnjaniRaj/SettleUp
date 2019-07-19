package training.practice;

import java.util.*;

public class Exp {
    public static void main(String[] args) {

//        Map<User, List<Integer>> bal= new HashMap<User,List<Integer>>();
//        User u1= new User("Anjani");
//        //System.out.println(bal.get(u1));
//        bal.put(u1,new ArrayList<Integer>(Arrays.asList(10,20)));
//        System.out.println(bal.get(u1));

        User u1= new User("Anjani");
        HashMap<User,int[]> map = new HashMap<User,int[]>();
        map.put(u1,new int[]{10,20});
        System.out.println(map.get(u1)[0]);
        map.get(u1)[0]=30;
        System.out.println(map.get(u1)[0]);
    }
}
