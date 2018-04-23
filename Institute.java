import java.util.ArrayList;
import java.util.List;

public class Institute {

    private String name;
    private List<Depertment> depertment;

    public Institute(String name, List<Depertment> depertment) {
        this.name = name;
        this.depertment = depertment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Depertment> getDepertmentList() {
        return depertment;
    }

    public void setDepertmentList(List<Depertment> depertmentList) {
        this.depertment = depertmentList;
    }

    public List<Depertment> getDep() {

        return depertment;
    }

    public String gerTotalstudentsInInstitutes() {

        int noOfStudents = 0;

        List<Student> students;
        /*
         * Foreach Loop
          * First loop check the num of dep
          * and than inner loop check num of student registered in dep*/
        for (Depertment dept : depertment) {
            students = dept.getStudents();
            for (Student s:students) {
                noOfStudents++;
            }

        }
         return noOfStudents+" Dep are addresses are" +depertment;
}

}
