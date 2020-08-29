package com.company.Collectionss.ArrayListss.College;

import java.util.*;

public class College {
    // depatment -wise student organise
    // cse list of cse student //sahil
    // ec  list ec student
    // it list it student
    // mech list of mech studengt

    public static Map<String, List<StudentBiodata>> studentMap = new HashMap<>();


    public static void addStudent(StudentBiodata collegeStudentObj){


        if(Objects.isNull(studentMap.get(collegeStudentObj.getDept()))) {
            List<StudentBiodata> studentList= new ArrayList<>();
            studentList.add(collegeStudentObj);
            studentMap.put(collegeStudentObj.getDept(),studentList);
        }
        else {
            List<StudentBiodata> studentLists=studentMap.get(collegeStudentObj.getDept());
            studentLists.add(collegeStudentObj);
            studentMap.put(collegeStudentObj.getDept(),studentLists);

//           studentMap.get(collegeStudentObj.getDept()).add(collegeStudentObj);
        }
    }

    public static void removeStudent(String department,String studentName){
     List<StudentBiodata>studentList=studentMap.get(department);
     if(Objects.nonNull(studentList)){
         for(StudentBiodata student:studentList){
             if(student.getName().equals(studentName)){
                 studentList.remove(student);
             }
             studentMap.put(department,studentList);
         }
     }
    }

    public static StudentBiodata getStudentByName(String department, String studentName){
        List<StudentBiodata> studentList= studentMap.get(department);
        if (Objects.nonNull(studentList)) {
            for (StudentBiodata studentBiodata : studentList) {
                if (studentBiodata.getName().equals(studentName)) {
                    return studentBiodata;
                }
            }
        }
    return null;
    }

}
