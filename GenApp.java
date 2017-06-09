
package methodgeneric;

/**
 *
 * @author Deni Rinaldi
 */
public class GenApp {
    private static <T> void printArray(T[] a){
        for (Object o : a){
            System.out.println(o);
        }
    }
    public static void main(String[] args){
        Integer iArr[] = new Integer[3];
        iArr[0] = 10;
        iArr[1] = 20;
        iArr[2] = 30;
        printArray(iArr);
        
        String sArr[] = new String[3];
        sArr[0] = "Sepuluh";
        sArr[1] = "Dua puluh";
        sArr[2] = "Tiga puluh";
        printArray(sArr);
        
        Double dArr[] = new Double[2];
        dArr[0] = 10.2;
        dArr[1] = 20.1;
        printArray(dArr);
        
        Character cArr[] = new Character[2];
        cArr[0] = 'D';
        cArr[1] = '3';
        printArray(cArr);
    }
}
