/**
 * Represents a boolean expression.
 * 
 * TODO: DATATYPE DEFINITION.
 */
public interface Expression {
    
    /**
     * @return the value of this expression
     */
    public boolean evaluate();
    
    default void print() {
        System.out.println("I am a boolean expression");
    }
    
    static boolean isEmpty(String str){
        return str == null;
    }
    
}