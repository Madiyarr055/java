public class student {

    String name;
    int age;
    String group;

    public student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Тобы: " + group);
    }

    public static void main(String[] args) {
        student s1 = new student("Мадияр", 19, "IS-21");
        s1.showInfo();
    }
}