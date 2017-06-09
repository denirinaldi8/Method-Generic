package methodgeneric;

/**
 *
 * @author Deni Rinaldi
 */
public class GenApp2 <T> {
    private T type;
    
    public T getType() {
        return type;
        
    }
    
    public void setType (T type) {
        this.type = type;
    }
    private static <Z> void whatYouDo (){
        System.out.println();
    }
    
    private static <N,T> void anythingYouWanted(N freeParType, T freeTwo) {
        System.out.println(freeParType);
        System.out.println(freeTwo);
    }
    public static void main (String[]Args) {
        anythingYouWanted(1,"Deni");
        
    }
    
}