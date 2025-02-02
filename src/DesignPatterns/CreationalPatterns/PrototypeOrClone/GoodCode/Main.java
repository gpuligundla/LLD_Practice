package DesignPatterns.CreationalPatterns.PrototypeOrClone.GoodCode;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("red", 11));
        gameBoard.addPiece(new GamePiece("blue", 4));

        gameBoard.showGameBoard();

        // clone the state of the gameboard; checkpoint

        GameBoard clonedBoard = gameBoard.clone();

        clonedBoard.showGameBoard();
    }
}

/*

here we have implemented the clone function in the gameboard and gamepeice classes which provides a new deep/shallow
copy which ever is needed. clone is just a standard name.

 */