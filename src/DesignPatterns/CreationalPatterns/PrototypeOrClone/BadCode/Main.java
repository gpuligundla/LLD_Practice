package DesignPatterns.CreationalPatterns.PrototypeOrClone.BadCode;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("red", 11));
        gameBoard.addPiece(new GamePiece("blue", 4));

        gameBoard.showGameBoard();

        // clone the state of the gameboard; checkpoint

        GameBoard clonedBoard  = new GameBoard();
        for(GamePiece gamePiece: gameBoard.getBoardState()){
            clonedBoard.addPiece(new GamePiece(gamePiece.getColor(), gamePiece.getPosition()));
        }

        clonedBoard.showGameBoard();
    }
}

/*
If you see in the above, the game board is the state which needs to be cloned. here we tried to manually perform the
copy operation of the object. But here the responsibility of copying is done by client however if any logic is changed
to the lib code client needs to provide an update for this.


instead we should switch the responsibility of allowing the objects to copy by its own respective classes. so that client
just call the function to get a new copied object. we can do it with prototype pattern.
 */