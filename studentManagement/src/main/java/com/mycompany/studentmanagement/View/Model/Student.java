
package com.mycompany.studentmanagement.View.Model;


public class Student {
    private String name;
    private int age;
    private String grade;
    private String rollNo;
    
    public Student(String name,int age,String grade,String rollNo){
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.rollNo=rollNo;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }
     public void setGrade(String grade){
        this.grade=grade;
    }
    
    public String  getRollNo(){
        return rollNo;
    } 
    
}
