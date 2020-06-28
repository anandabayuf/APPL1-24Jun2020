/*
 * Created By Ananda Bayu Fauzan.
 */
package application;

import models.*;
import interfaces.*;
/**
 *
 * @author Ananda Bayu
 */
public class Startup {
    public static void main(String[] args){
        File file = new File("Test", 12, 12);
        Music music = new Music("Some Name", "Cool", 15, 2222);

        StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);
        
        System.out.println(streamFileInfo.calculateCurrentPercent());
        System.out.println(streamMusicInfo.calculateCurrentPercent());
    }
}
