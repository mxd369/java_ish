/**
 * Immutable player in a chessboxing tournament.
 */
public class Player {
    
    private final String name;
    private final int skill;
    
    public Player(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }
    
    public int skill() {
        return skill;
    }
    
    @Override public String toString() {
        return name + " (" + skill + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if ( ! (obj instanceof Player)) { return false; }
        Player other = (Player)obj;
        return name.equals(other.name) && skill == other.skill;
    }
    
    @Override
    public int hashCode() {
        return name.hashCode() + skill;
    }
}


//create a new player with given name and skill
//Player: String int  Player

//get the skill of this player
//skill: Player  int

//return string with name and skill of this player
//toString: Player  String
//
//With your partner, implement Player.
//
//It should be a single class with 2 fields, 1 constructor, and 4 methods