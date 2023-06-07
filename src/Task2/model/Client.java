package Task2.model;

public class Client {
    private String name;
    private int age;
    private Gender gender;
    private String email;
    private int password;

    public Client(){}

    public Client(String name, int age, Gender gender, String email, int password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nClient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}
