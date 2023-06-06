public class AgeException extends Exception {
    private int age;

    public AgeException(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getMessage() {
        return "Invalid age";
    }

}
