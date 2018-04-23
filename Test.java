import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){
        Student s1 = new Student("Ahsan1","Fa170061","BSCS");
        Student s2 = new Student("Ahsan2","Fa170061","BSCS");
        Student s3 = new Student("Ahsan3","Fa170061","BSCS");
        Student s4 = new Student("Ahsan4","Fa170061","BSEE");


//        Depertment depertment = new Depertment("BSCS","0061",);

        List<Student> cs_students = new ArrayList<>();
        cs_students.add(s1);
        cs_students.add(s2);
        cs_students.add(s3);

        List<Student> ee_students = new ArrayList<>();
        ee_students.add(s4);

        Depertment depertment_EE = new Depertment("BSEE",0061,ee_students);
        Depertment depertment_CS = new Depertment("BSCS",0061,cs_students);

        List<Depertment> depertments = new ArrayList<>();

        depertments.add(depertment_CS);
        depertments.add(depertment_EE);


//        List<Depertment> BSEE = new ArrayList<>();
//        BSEE.add(depertment_EE);

        Institute institute = new Institute("MAJU",depertments);

        System.out.println("Total Number OF Student registered are "+institute.gerTotalstudentsInInstitutes()+" Depertement  are "+depertments.add(depertment_CS)+"Depertement Names is  "+depertments.get(0).getName()+" "+
        depertments.get(1).getName()+" "+ institute.getName()+"Student name is  "+depertment_CS.getStudents().get(0).getName()+"EE Dep student name is "+depertment_EE.getStudents().get(0).getName());

    }


}
/*  Agreagtion
* Code reuse is best achive by agregation!!
*  has - a relationship
 *Both the entities are independent of each other in agregation
   *  */