public class Board{
private int[][] paper;
private String line;

    public Board(int[][] paper){
        this.paper = paper;
        line = "";
    }

    public void board(){
        Interface.toTerminal(line);
    }

    public void refresh(){
        String [][] board = matString();
        line = "\n"+
                      " "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" || "+board[0][3]+" | "+board[0][4]+" | "+board[0][5]+" || "+board[0][6]+" | "+board[0][7]+" | "+board[0][8]+" \n"+
                      "---+---+---++---+---+---++---+---+---\n"+
                      " "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" || "+board[1][3]+" | "+board[1][4]+" | "+board[1][5]+" || "+board[1][6]+" | "+board[1][7]+" | "+board[1][8]+" \n"+
                      "---+---+---++---+---+---++---+---+---\n"+
                      " "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" || "+board[2][3]+" | "+board[2][4]+" | "+board[2][5]+" || "+board[2][6]+" | "+board[2][7]+" | "+board[2][8]+" \n"+
                      "===+===+===++===+===+===++===+===+===\n"+
                      " "+board[3][0]+" | "+board[3][1]+" | "+board[3][2]+" || "+board[3][3]+" | "+board[3][4]+" | "+board[3][5]+" || "+board[3][6]+" | "+board[3][7]+" | "+board[3][8]+" \n"+
                      "---+---+---++---+---+---++---+---+---\n"+
                      " "+board[4][0]+" | "+board[4][1]+" | "+board[4][2]+" || "+board[4][3]+" | "+board[4][4]+" | "+board[4][5]+" || "+board[4][6]+" | "+board[4][7]+" | "+board[4][8]+" \n"+
                      "---+---+---++---+---+---++---+---+---\n"+
                      " "+board[5][0]+" | "+board[5][1]+" | "+board[5][2]+" || "+board[5][3]+" | "+board[5][4]+" | "+board[5][5]+" || "+board[5][6]+" | "+board[5][7]+" | "+board[5][8]+" \n"+
                      "===+===+===++===+===+===++===+===+===\n"+
                      " "+board[6][0]+" | "+board[6][1]+" | "+board[6][2]+" || "+board[6][3]+" | "+board[6][4]+" | "+board[6][5]+" || "+board[6][6]+" | "+board[6][7]+" | "+board[6][8]+" \n"+
                      "---+---+---++---+---+---++---+---+---\n"+
                      " "+board[7][0]+" | "+board[7][1]+" | "+board[7][2]+" || "+board[7][3]+" | "+board[7][4]+" | "+board[7][5]+" || "+board[7][6]+" | "+board[7][7]+" | "+board[7][8]+" \n"+
                      "---+---+---++---+---+---++---+---+---\n"+
                      " "+board[8][0]+" | "+board[8][1]+" | "+board[8][2]+" || "+board[8][3]+" | "+board[8][4]+" | "+board[8][5]+" || "+board[8][6]+" | "+board[8][7]+" | "+board[8][8]+" \n";
        
        Interface.toTerminal(line);
    }

    private String[][] matString(){
        String[][] line = new String[9][9];
        int x;

        for(int i = 0; i < paper.length; i++)
            for(int j = 0; j < paper[i].length; j++){
                x = paper[i][j];
                if(verif(i, j)) break;
                
                else if(x != 0)
                    line[i][j] = "" + x;
                else
                    line[i][j] = " ";
            }

        return line;
    }

    private boolean verif(int a, int b){
        int x = paper[a][b];
        if(x < 0 || x > 9){
            Interface.toTerminal(msg1(a,b));
            return true;
        }
        return false;
    }


    

    //-----------EXCEPTIONS-----------
    private String msg1(int a, int b){
        return "O valor " + paper[a][b] + " nao e valido no sudoku."+
               "\nRevisa issae na posicao \"matriz\"[" + a + "][" + b + "].";
    }
}