import java.util.Objects;

class Student implements Comparable<Student>{

   
    Integer age;
    String name;
    int points;

    public Student(int age, String name, int points) {
        this.age = age;
        this.name = name;
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && points == student.points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, points);
    }

    @Override
    public String toString() {
        return "{" +
            " age='" + getAge() + "'" +
            ", name='" + getName() + "'" +
            ", points='" + getPoints() + "'" +
            "}";
    }
    @Override
    public int compareTo(Student student){
        return this.age.compareTo(student.age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}