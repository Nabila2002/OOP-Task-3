package nabila;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType,int over,Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("This is an "+matchType);
        System.out.println("The match is "+over+" over");
        System.out.println("The name of the player is : "+player.playerName);
        System.out.println("The player jersey no is : "+player.jerseyNumber);
    }
}
/*Name : Nabila Zannat
ID no : 2012020098
sec:5(B)
Email : cse_2012020098@lus.ac.bd
Date : 11/09/2021
*/