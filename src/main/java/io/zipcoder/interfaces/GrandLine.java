package io.zipcoder.interfaces;

import java.util.HashMap;

public class GrandLine {
    //Fields
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    //Methods
    public void hostLecture(Teacher teacher, double numberOfHours){
        Student[] kids = (Student[]) students.toArray();
        teacher.lecture(kids,numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) throws Exception{
        Instructor prof =(Instructor) instructors.findById(id);
        hostLecture(prof,numberOfHours);
    }

    //Getter
    public HashMap<Student, Double> getStudyMap(){
        HashMap ans = new HashMap();
        Student[] kids = (Student[]) students.toArray();

        for(Student kid : kids){ ans.put(kid,kid.getTotalStudyTime()); }
        return ans;
    }
}
