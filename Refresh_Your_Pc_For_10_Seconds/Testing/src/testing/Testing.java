/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author inahm
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        
        new Thread(new Runnable() {
 
            @Override
            public void run()
            {
                try {
                    Thread.sleep(11000);
                } catch (InterruptedException ex) {
                }
                System.exit(0);
 
            }
        }).start();
            
        
        new Thread(new Runnable() {
 
            @Override
            public void run()
            {
                 for(int a=0; a<12;)
            {
                     try {
                         Thread.sleep(1000);
                         Runtime.getRuntime().exec( " wscript refresh.vbs" );
                     } catch (InterruptedException ex) {
  
                     } catch (IOException ex) {
            
                     }
            }
 
            }
        }).start();
            
    }
    
}
