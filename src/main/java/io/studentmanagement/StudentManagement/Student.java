package io.studentmanagement.StudentManagement;

public class Student {
    private String id;
    private String name;
    private String age;
    private String father_name;
    private String mother_name;

    public Student(String id, String name, String age, String father_name, String mother_name) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.father_name = father_name;
        this.mother_name = mother_name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }
}
