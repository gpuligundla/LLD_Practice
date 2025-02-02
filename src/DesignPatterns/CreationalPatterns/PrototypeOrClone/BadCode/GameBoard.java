package DesignPatterns.CreationalPatterns.PrototypeOrClone.BadCode;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    List<GamePiece> board = new ArrayList<>();

    public void addPiece(GamePiece piece){
        board.add(piece);
    }

    public List<GamePiece> getBoardState(){
        return board;
    }

    public void showGameBoard(){
        System.out.println("Current Board State");
        for(GamePiece gamePiece:board){
            System.out.println(gamePiece);
        }
    }
}
