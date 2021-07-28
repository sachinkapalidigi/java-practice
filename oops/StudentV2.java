class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subID, String name, int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public void setMarksObtained(int marksObtained){
        if(marksObtained>this.maxMarks) return;
        this.marksObtained = marksObtained;
    }
}



public class StudentV2 {
    private int rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

    public StudentV2(int rollNo, String name, String dept){
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
    }

    public Subjects[] getSubjects(){
        return this.subjects;
    }

    // public void setSubjects(Subject[] subjects){
    //     this.subjects = subjects;
    // }
    public void setSubjects(Subject ...subjects){
        this.subjects = subjects;
    }
}
