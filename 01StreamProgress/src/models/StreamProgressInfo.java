/*
 * Created By Ananda Bayu Fauzan.
 */
package models;

import interfaces.IStreamable;
/**
 *
 * @author Ananda Bayu
 */
public class StreamProgressInfo {
    private IStreamable file;
    
    public StreamProgressInfo(IStreamable file){
        this.file = file;
    }
    
    public int calculateCurrentPercent(){
        return this.file.getBytesSent() * 100 / this.file.getLength();
    }
}
