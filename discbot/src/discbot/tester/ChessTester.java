package discbot.tester;

import java.io.BufferedReader;
import java.io.FileReader;

import discbot.game.chessgame.Chessboard;
import discbot.tester.chesscommand.*;

public class ChessTester implements TesterI {

    private BufferedReader freader;

    Chessboard b;

    @Override
    public void processFile(String fileIn) {
        readFile(fileIn);
        processLines();
        closeFile();
    }
    
    private void readFile(String fileIn){
        try{
            freader = new BufferedReader(new FileReader(fileIn));
        }catch(Exception e){
            System.err.println("Error when reading into freader");
        }
    }

    private void processLines(){
        try{
            String line = freader.readLine();
            while(line != null){
                processSingularLine(line);
                line = freader.readLine();
            }
        }catch(Exception e){
            System.err.println("We have an error boss");
        }
    }
    
    private void closeFile(){
        try{
            freader.close();
        }catch(Exception e){}
    }
    private void processSingularLine(String lineIn){
        String command = lineIn.split(" ")[0];
        switch(command){
            case "CLEAR":
                Clear.execute(b, lineIn);
                break;
            case "LINE":
                Line.execute(b, lineIn);
            case "SET":
            case "MOVE":
            case "PRINT":
                Print.execute(b, lineIn);
            case "DEFAULT":
                break;
        }
    }
 
    private void set(String lineIn){
        // TODO 
    }

    private void move(String lineIn){
        // TODO 
    }

}