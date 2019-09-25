package cardgame1;
import java.util.*;
/**
 *
 * @author Admin
 */
public class CardTrick1 {
    
    public static void main(String[] args) {
        
        
        CardGame1[] card_in_Hand = new CardGame1[7];
        
        for(int i = 0 ; i < card_in_Hand.length ; i++){
            CardGame1 c1 = new CardGame1();
            c1.setSuit(CardGame1.SUITS[c1.ranSuit()]);
            c1.setValues(c1.ranValue());
            card_in_Hand[i] = c1;
            System.out.println(card_in_Hand[i].getSuit() +  " = "  + 
                    card_in_Hand[i].getValues());
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the suit number : " );
        int num = sc.nextInt();
        System.out.println("Enter the value of cards : ");
        int value1 = sc.nextInt();
        
        
    }
    
}
