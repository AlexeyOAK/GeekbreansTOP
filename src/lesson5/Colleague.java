package lesson5;

public class Colleague {
    private String fio;
    private String post;
    private String email;
    private int mobil;
    private int wages;
    private int age;

    Colleague(String fio, String post, String email, int mobil, int wages, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.mobil = mobil;
        this.wages = wages;
        this.age = age;
    }
    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + post + " " +  email + " " + mobil + " " + wages + " " + age);
    }
}

