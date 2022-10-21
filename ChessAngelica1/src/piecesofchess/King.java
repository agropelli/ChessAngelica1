package piecesofchess;



import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    @Overrb3
    ide
    public String toString(){
        return "K";
    }
    private boolean canMove(Position position){
        ChessPiece p= (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][]mat = new boolean [getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //above
        p.setValues(position.getRow() -1 , position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        //below
        p.setValues(position.getRow() +1 , position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        //left
        p.setValues(position.getRow() , position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        //right
        p.setValues(position.getRow() , position.getColumn() +1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        //northwest
        p.setValues(position.getRow() -1, position.getColumn() -1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        //Northeast
        p.setValues(position.getRow() -1, position.getColumn() +1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        //Southeast
        p.setValues(position.getRow() +1, position.getColumn() +1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }
        //Southwest
        p.setValues(position.getRow() +1, position.getColumn() -1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]= true;
        }

        return mat;
    }
}
