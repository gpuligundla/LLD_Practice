package DesignPatterns.CreationalPatterns.PrototypeOrClone.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
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

    @Override
    public GameBoard clone() {
        GameBoard newBoard = new GameBoard();
        for(GamePiece gamePiece:board){
            newBoard.addPiece(gamePiece.clone()); // if we write gamePeice, it  is shallow copy
        }
        return newBoard;
    }
}
