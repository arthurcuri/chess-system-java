package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // above
        p.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p)) {
                break;
            }
            p.setRow(p.getRow() - 1);
        }

        // left
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p)) {
                break;
            }
            p.setColumn(p.getColumn() - 1);
        }

        // right
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p)) {
                break;
            }
            p.setColumn(p.getColumn() + 1);
        }

        // below
        p.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p)) {
                break;
            }
            p.setRow(p.getRow() + 1);
        }

        // nw
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p)) {
                break;
            }
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        }

        // ne
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p)) {
                break;
            }
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }

        // se
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p)) {
                break;
            }
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }

        // sw
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            if (getBoard().thereIsAPiece(p)) {
                break;
            }
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        }

        return mat;
    }
}
