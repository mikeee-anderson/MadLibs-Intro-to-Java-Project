public class MadLibs {
    /*
    This program generates a mad libbed story.
  Author: Laura
  Date: 2/19/2049
  Your description here
    */
    public static void main(String[] args){
        String name1 = "Michael";
        String adjective1 = "tired";
        String adjective2 = "long";
        String adjective3 = "worried";
        String verb1 = "chant";
        String noun1 = "activists";
        String noun2 = "money";
        String noun3 = "soldiers";
        String noun4 = "people";
        String noun5 = "water";
        String noun6 = "monkeys";
        String name2 = "Joseph";
        int number = 69;
        String place1 = "Gaza";

        //The template for the story
        String story = "This morning "+ name1 +" woke up feeling "+ adjective1 +". 'It is going to be a "+ adjective2 +" day!' Outside, a bunch of "+ noun1 +"s were protesting to keep "+ noun2 +" in stores. They began to "+ verb1 +" to the rhythm of the "+ noun3 +", which made all the "+ noun4 +"s very "+ adjective3 +". Concerned, "+ name1 +" texted "+ name2 +", who flew "+ name1 +" to "+ place1 +" and dropped "+ name1 +" in a puddle of frozen "+ noun5 +". "+ name1 +" woke up in the year "+ number +", in a world where "+ noun6 +"s ruled the world.";

        System.out.println(story);
    }
}
