public class City {
    String name;
    int age;

    public City(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
