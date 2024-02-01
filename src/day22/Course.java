package day22;

import day07.Student;

public class Course {
    //1. 모든 사람이면 등록 가능
    public static  void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.Kind.getClass().getSimpleName()+"이 Course1 등록");
    }


    //2. 학생만 등록 가능
    public static  void registerCourse2(Applicant<?extends Student> applicant){
        System.out.println(applicant.Kind.getClass().getSimpleName()+"이 Course2 등록");
    }
    //3. 직장인 및 일반인 등록 가능
    public static  void registerCourse3(Applicant<?super Worker > applicant){
        System.out.println(applicant.Kind.getClass().getSimpleName()+"이 Course3 등록");
    }
}
