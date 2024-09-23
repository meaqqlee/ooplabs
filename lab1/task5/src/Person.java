public class Person {
    private final Gender gender;
    private int id;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }
}
