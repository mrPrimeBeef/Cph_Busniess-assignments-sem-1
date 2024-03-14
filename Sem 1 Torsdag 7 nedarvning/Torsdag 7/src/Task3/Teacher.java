package Task3;

import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }
    @Override
    public boolean addCourse(String course) {
        for (String element : canTeach){
            if (!element.equals(course)){
                currentCourses.add(course);
            }
            return true;
        }
        return false;
    }
}
