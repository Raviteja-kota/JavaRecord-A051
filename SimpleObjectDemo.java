class Student {
    String name;
    void display() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.display();
    }
}
