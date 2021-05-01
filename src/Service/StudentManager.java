package Service;

import Entity.Person;

public class StudentManager extends PersonManager {
    public void addComment(String comment){
        System.out.println(comment+" added.");
    }

    public void deleteComment(String comment){
        System.out.println(comment+" deleted.");
    }

    public String showPassword(Person person){
         return  "Your password is "+person.getPassword();
    }
}
