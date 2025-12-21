package Project;

import java.util.*;

public class UserManagementDemo {

    List<User> users = new ArrayList<>();

    {
        users.add(new User("John", true, new HashSet<>(Arrays.asList("USER"))));
        users.add(new User("Jane", false, new HashSet<>(Arrays.asList("USER"))));

        users.add(new User("MAYANK", true, new HashSet<>(Arrays.asList("USER"))));
    }

    public void removeInactiveUsers() {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            if (!iterator.next().isActive()) { // check for active status
                iterator.remove(); // remove inactive users
            }
        }
    }

    public void printActiveUsers() {
        System.out.println("Active users");
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    public static void main(String[] args) {
        UserManagementDemo demo = new UserManagementDemo();
        demo.removeInactiveUsers();
        demo.printActiveUsers();
    }
}
