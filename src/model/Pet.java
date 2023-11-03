package model;

public class Pet {
    private String nicknme;
    private int age;

    public Pet() {

    }

    public Pet(String nicknme, int age) {
        this.nicknme = nicknme;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("nicknme='").append(nicknme).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
