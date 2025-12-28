import java.util.Scanner;

// ---------- Superclass ----------
class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

// ---------- Subclass ----------
class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

// ---------- Subclass ----------
class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

// ---------- Main Class ----------
public class Lab05_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Developer
        String devName = sc.nextLine();
        int devProjects = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Input Admin
        String adminName = sc.nextLine();
        int adminProjects = sc.nextInt();
        sc.nextLine(); // clear buffer
        String adminKey = sc.nextLine();

        // 1. Create objects
        User u1 = new User("Guest");
        Developer d1 = new Developer(devName, devProjects);
        Admin a1 = new Admin(adminName, adminProjects, adminKey);

        // 2. Store in User array
        User[] users = { u1, d1, a1 };

        // 3. Calculate total clearance
        int totalClearance = 0;
        for (User u : users) {
            totalClearance += u.getClearanceLevel();
        }

        // 4. Downcasting for Admin
        for (User u : users) {
            if (u instanceof Admin) {
                Admin admin = (Admin) u;
                System.out.println(admin.getAdminKey());
            }
        }

        // 5. Display total clearance
        System.out.println(totalClearance);

        sc.close();
    }
}
