public class app{
    public static int[][] board;
    public static Board paper;

    public static void main(String args[]){
        board = new int[9][9];
        paper = new Board(board);
        Interface.begin();
    }

    public static void main(){

        //TUTORIALZINHO ~
        /*
         *  board[linha][coluna] -> É a matriz responsável por ser impressa no terminal 
         *  paper.refresh()      -> Método que atualiza o terminal com os novos valores
         *  Interface.getNew()   -> Pede novas informações para o usuário
         *  
         *           Informação capturada do usuário no último getNew()
         *  Interface.linha        
         *  Interface.coluna     ->  Vamos lá, essa dai já é auto explicativo.
         *  Interface.numero      
         */

        //Exemplinho ~
        // Solicita os dados para o usuario
        Interface.getNew();

        // "Adiciona o números no tabuleiro"
        board[Interface.linha][Interface.coluna] = Interface.numero;
        
        // atualiza o "tabuleiro" no terminal
        paper.refresh(); 


        //TODO -> Siga Daqui :)
        //Boa sorte <3
    }
}