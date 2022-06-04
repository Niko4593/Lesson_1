package Lesson_1;

public class Participant {

    private String name;
    private int seconds;

    public Participant(String name, int seconds){
        this.name = name;
        this.seconds = seconds;
    }
    public String getName() {return name;}
    public int getSeconds() {return seconds;}
}
