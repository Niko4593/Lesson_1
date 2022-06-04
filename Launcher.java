package Lesson_1;

public class Launcher {

    public static void main(String[] args){
        Participant[] participant = new Participant[4];
        participant[0] = new Participant("Boris. ", 56);
        participant[1] = new Participant("Igor. ", 49);
        participant[2] = new Participant("Egor. ", 44);
        participant[3] = new Participant("Petr. ", 58);
        Team team = new Team("FalseStart", participant);

        Course course = new Course(17,20,13);
        String result = course.doIt(team);
        System.out.println(result);
    }
}
