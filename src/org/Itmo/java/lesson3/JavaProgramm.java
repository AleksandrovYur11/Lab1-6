package org.Itmo.java.lesson3;

class Study {
    private String course;

    Study(String course){
        this.course = course;
    }

    public String printCourse(){
        return this.course;
    }
}

public class JavaProgramm {
    public static void main(String[] args){
        Study student = new Study("Изучение Java - это просто!");
        System.out.println(student.printCourse());
    }

}
