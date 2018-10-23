/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicfromtextfinalproject;

import java.util.Map;
import java.util.TreeMap;
import static musicfromtextfinalproject.Text2Music.cosku;
import static musicfromtextfinalproject.Text2Music.duygusal;
import static musicfromtextfinalproject.Text2Music.hüzünlü;
import static musicfromtextfinalproject.Text2Music.korku;
import static musicfromtextfinalproject.Text2Music.mutluluk;

/**
 *
 * @author Senih
 */
public class EmotionThread extends Thread{
    
    String textNorm=null;
    
    public EmotionThread(String textNorm) {
        this.textNorm=textNorm;
    }
    
    @Override
    public void run(){
    super.run();
    
    //EmotionResults(textNorm);
    }
    
    
    
}

