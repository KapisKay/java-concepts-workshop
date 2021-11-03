/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {

    private String name = "Liverpool";
    private int  number_of_players = 11;



    @Override
    String getName() {
        return "Liverpool";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println( "There are " + number_of_players + " in " + getName());
    }



}

