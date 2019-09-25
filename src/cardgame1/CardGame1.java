
package cardgame1;

/**
 *
 * @author Admin
 */
public class CardGame1 {

   private String suit;   // spades,diamonds,clubs,hearts
   private int values;    //values from 1 to 13
   public static final String[] SUITS= {"spades" , "diamonds" , "clubs" , "hearts"};

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the values
     */
    public int getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(int values) {
        this.values = values;
    }
   
    public int ranSuit(){
    
        int valuesuit = (int) (Math.random() * 3) + 1;
        return valuesuit;
        
    }
   
    public int ranValue(){
    
        int value = (int) (Math.random() * 13) + 1;
        return value;
    }
    
    
}
