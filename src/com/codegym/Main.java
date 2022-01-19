package com.codegym;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student("Thắng",31,"Hà Nội");
        Student student2 = new Student("Cường",21,"Thái Bình");
        Student student3 = new Student("Thủy", 30, "Nam Đinh");
        List<Student> studentList =new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
      Collections.sort(studentList, new Comparator<Student>() {
          @Override
          public int compare(Student o1, Student o2) {
              if (o1.getAge()>o2.getAge()){
                  return 1;
              }else {
                  if (o1.getAge() < o2.getAge()){
                      return -1;
                  }else{
                      return 0;
                  }
              }
          }
      });
        for (Student student:studentList) {
            System.out.println(student);
        }
    }
}
