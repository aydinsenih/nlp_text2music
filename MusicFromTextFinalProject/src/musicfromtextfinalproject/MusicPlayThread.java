/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicfromtextfinalproject;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

/**
 *
 * @author Yasir KILIC
 */
public class MusicPlayThread extends Thread{

     Pattern p=new Pattern();  
     Player player=new Player();
     String patt=null;
     /*String[] text;
     String[] pattString;
     int sayac=0;
     int[] tempo;
     boolean check=false;
     Lock kilit;
     */
    MusicPlayThread(String patt) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.patt=patt;
        /*text=par;
        this.pattString=pattString;
        this.tempo=tempo;
        set(false);*/
    }

    
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
        player.play(patt);
        
        /*int i=0;
        
        for (int j = 0; j < text.length; j++) {
        
        
        while(i<text[j].split(" ").length/24)
        {
        //pattString=sayac%2==0?pattString:new StringBuilder(pattString).reverse().toString();
        Pattern temp_pattern=new Pattern(sayac%2==0?pattString[j]:new StringBuilder(pattString[j]).reverse().toString());
        // System.out.println("Tempo:"+tempo);
        temp_pattern.setTempo(tempo[j]+new Random().nextInt(30)).setInstrument("Piano");
        player.play(temp_pattern);
        
        
        i++;
        }
        
        }
        
        kilit.lock();
        try {
        set(true);
        get();
        } finally {
        kilit.unlock();
        }*/
        
        try {
        sleep(1);
        }
        catch (InterruptedException ex) {
        Logger.getLogger(MusicPlayThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    AtomicBoolean atomicb=new AtomicBoolean(true);
    public void set(boolean check){
        atomicb.set(check);
    }
    public boolean get(){
        return atomicb.get();
    }
/*
    @Override
    public State getState() {
        return super.getState(); //To change body of generated methods, choose Tools | Templates.
    }*/
    

   
    
    
    
    
    
}
