package Service;

import Entity.Person;

public class PersonManager {
    public void addCourse(String courseName){
        System.out.println(courseName+" added.");
    }

    public void deleteCourse(String courseName){
        System.out.println(courseName+" deleted.");
    }

    public String[] listOfCourse(Person person){
        return person.getCourses();
    }
}
