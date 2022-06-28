package telran.numbers;

public class TictactoeGame {
	public static int tictactoeMove(char matrix[][], int nRow, int nCol, char symb) {
		matrix[nRow][nCol] = symb;
		int res = 0;
		if(isRowWin(matrix, nRow) || isColWin(matrix, nCol) || isDiagWin(matrix)) res = 1;
		if(isMatrixFull(matrix)) res = 2;
		return res;
	}
	static boolean isRowWin (char matrix[][], int nRow) {
		boolean isRow = true;
		for(int i = 1; i<matrix.length; i++) {
			 if(matrix[nRow][i] != matrix[nRow][i-1]) isRow = false;
		}
	return isRow;
	}
	static boolean isColWin (char matrix[][], int nCol) {
		boolean isCol = true;
		for(int i = 1; i<matrix.length; i++) {
			 if(matrix[i][nCol] != matrix[i-1][nCol]) isCol = false;
		}
	return isCol;
	}
	static boolean isDiagWin (char matrix[][]) {
		boolean isDiag = true;
		for(int i = 1; i<matrix.length; i++) {
			if(matrix[i][i] != matrix[i-1][i-1]) isDiag = false;
			if(matrix[matrix.length-1-i][matrix.length-1-i] != matrix[matrix.length-1-i][matrix.length-1-i]) isDiag = false;
		}
	return isDiag;
	}
	static boolean isMatrixFull(char matrix[][]) {
		boolean isFull=true;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length;j++) {
				if(matrix[i][j]=='1') isFull = false;
			}
		}
	return isFull;
	}
}
