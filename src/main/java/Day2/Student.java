package Day2;

public class Student implements Comparable<Student>{
    private int id=1;
    private String name="Anh";

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.id>o.id){
            return 1;
        }else if(this.id<o.id) {
            return -1;
        }
        return 0;
    }
}
