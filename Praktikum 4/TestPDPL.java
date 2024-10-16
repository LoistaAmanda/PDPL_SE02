public class TestPDPL {
    public static void main(String[] args) {
        PDPL obj = new PDPL();

        obj.setName("Loista");
        obj.setAge(20);
        obj.setRoll(10);


        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());
    }
}