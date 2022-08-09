public class Main {
    public static void main(String[] args) {

        Person person = new Person()
                .setName("Shayla").setLastName("Mayer").setMiddleName("Younger")
                        .setCountry("Australia").setAddress("Villa, Q6").setPhone("+3768073834838")
                        .setAge(35).setGender("women");

        System.out.println(person);

        Shape shape = new Triangle();
        shape.draw();

        Shape shape1 = new Square();
        shape1.draw();
    }
}
