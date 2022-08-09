

public class Person implements PersonBuilder{

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    @Override
    public Person setName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public Person setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public Person setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
