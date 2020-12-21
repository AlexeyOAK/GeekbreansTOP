package lesson5;

public class Main {
    public static void main(String[] args) {
        Colleague[] personArray = new Colleague[5];
        personArray[0] = new Colleague("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 89232312, 30000, 30);
        personArray[1] = new Colleague("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", 182312312, 40000, 40);
        personArray[2] = new Colleague("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", 282312312, 50000, 20);
        personArray[3] = new Colleague("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", 389312312, 60000, 65);
        personArray[4] = new Colleague("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", 482312312, 70000, 71);
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].GetAge() > 40) {
                personArray[i].Show();
            }
        }
    }

}
