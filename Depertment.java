import java.util.ArrayList;
import java.util.List;

public class Depertment {

    private String name;
    private int code;
    private List<Student> students;

    public Depertment(String name, int code , List<Student> students) {
        this.name = name;
        this.code = code;
        this.students = students;
    }

    public List<Student> getStudents(){

        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
