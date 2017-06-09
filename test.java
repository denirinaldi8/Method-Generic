
package methodgeneric;

/**
 *
 * @author Deni Rinaldi
 */
public class test {
String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nm){
     this.nama= nm;   
    
    }
 
    private static <T> void nwclass (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        test nw = new test();
        
        nw.setNama("Deni");
        System.out.println(nw.getNama());
        nwclass("this example");
        
    }
    
}