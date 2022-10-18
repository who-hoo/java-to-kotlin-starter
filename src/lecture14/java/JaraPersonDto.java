package lecture14.java;

import java.util.Objects;

public class JaraPersonDto {

    private final String name;
    private final int age;

    public JaraPersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JaraPersonDto that = (JaraPersonDto) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "JaraPersonDto{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
