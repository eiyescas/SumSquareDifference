/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumsquaredifference;

/**
 *
 * @author esmeralda.iyescas001
 */
public class SumSquareDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long total = 0;
        long total2 = 0;
        long total3 = 0;
        for(int i= 1; i <= 100; i++ ){
            System.out.println(Math.pow(i, 2));
            total += Math.pow(i,2);
            System.out.println(total);
            
            total2 += i;
            
        }
        
        total3 = (long)Math.pow(total2,2);
        
        System.out.println(total3 - total);
        
        
         
    }
    
}
