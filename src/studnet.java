public class studnet {
    private int studentRollNo;
    String name;

    public studnet(int studentRollNo, String name) {
        this.studentRollNo = studentRollNo;
        this.name = name;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
