package Lesson_1;

public class Course {
    String result;
    private int labyrinth;
    private int stairs;
    private int pipe;

    public Course(int labyrinth, int stairs,int pipe){
        this.labyrinth = labyrinth;
        this.stairs = stairs;
        this.pipe = pipe;
    }

    public String doIt(Team team){
        result = "Team name: "+ team.getName()+" " + '\n';
        for (Participant participant: team.getParticipants()){
            result += "Participant name: " + participant.getName() +" ";
            int spentTime = participant.getSeconds();
            int allottedTime = 50;
            successfulAttempt(spentTime,allottedTime);
            unsuccessfulAttempt(spentTime,allottedTime);

        }
        return result;
    }

    private void successfulAttempt(int spentTime, int allottedTime){
        if(spentTime<allottedTime) result += "Successful attempt," + " spent time - " + spentTime + '\n';
    }
    private void unsuccessfulAttempt(int spentTime, int allottedTime){
        if(spentTime>allottedTime) result += "Unsuccessful attempt," + " spent time - " + spentTime + '\n';
    }

}
