# Jogo didático para estudo de Fundamentos da Programação
A proposta deste é ajudar os estudantes de programação a desenvolver/treinar as habilidades de Fundamentos da programação.

# Sudoku
## Regras do jogo
Completar todos os quadros, sendo que, cada quadrado de 3x3 deve conter todos os números de 1 a 9
não podendo os repetir nas subsequentes linhas ou colunas; 

## Lógica empregada
Serão aceitos números de 0 a 9, sendo 0 impresso com quadrado vazio;
A variável (matriz) board da classe app é a responsável pela visualização dos números no terminal;
Para atualizar a "interface" no terminal basta chamar o método paper.refresh().

## Objetivos principais
 - Adicionar o método "Start()", qual deverá fazer o shuffle de números aleatórios dentro da matriz, obviamente respeitando as regras do jogo;
 - Validar a entrada de dados do usuário;
 - Fazer a verificação se a entrada do usuário está dentro das regras do jogo;
 - Atualizar a interface gráfica do terminal a cada jogada do usuário;
 - Criar o loop para que o usuário possa continuar jogando.
 
##Objetivos secundários
 **Alterando a classe interface**
 - Adicionar a possibilidade de pesquisar quantos quadros ainda faltam ser preenchidos;
 - Adicionar a opção "sair", qual deve fechar o jogo;
 - Adicionar a opção "resetar", qual deve recomeçar o jogo com novos números aleatórios *Start.

 **Jogabilidade**
 - Prever a possibilidade de alteração de número já jogado, sendo que os números gerados no método "Start()" NÃO podem ser alterados pelo usuário; 
 - Adicionar verificação se o usuário venceu a partida;
 - Adicionar mensagem de congratulação ao usuário por finalizar a partida e chame o método Interface.finish();
 - Ao finalizar a partida o jogo deverá recomeçar com novos números aleatórios.

 
# Material de apoio
## Estrutura de classes
1. Interface - Comunicação com o usuário
 * begin(): app.main();
 * toTerminal: System.out.println(param);
 * getNew(): Pega uma nova posição da matriz com o usuário.

2. Board - Representação gráfica da matriz
 * Board(int[][] paper): Construtor; Captura a referência da matriz;
 * board(): Retorna ultimo desenho válido;
 * refresh(): Atualiza o desenho;
 * matString(): Converte a matriz inteira referenciada no construtor para String;
 * verif(): Verifica se o valor da matriz a ser atualizada não possui nenhuma falha;
 * -Exceptions-: Mensagens indicando o erro.

3. app - Desenvolvimento lógico
 * main(String args[]): main do programa, qual cria e estrutura o jogo;
 * main(): //TODO, onde todo o código dos objetivos deve ser desenvolvido.

## Considerações
* Porque usar o Interface.toTerminal(param) ao invés do System.out.println(param) diretamente: Um programa bem estruturado tem a seperação de funcionalidade de suas classes, onde cada uma tem sua função definida. A da Interface é printar e capturar tudo que seja necessário;
* A matriz utilizada na classe app é int (tipo primitivo), enquanto a matriz da classe Board é String para que possa ser impresso o espaço vazio no terminal;
** A matriz app não é String e utilizade diretamente na classe Board pois a ideia não é complicar, então o trabalho de formatação e representação gráfica já está previamente construida. A proposta é que possa estudar a utilização de matriz. Complicar com tipos não primitivos será a próxima etapa
* Apenas a classe app deverá ser alterada, evitando preocupações com desenvolvimento visual;
* A classe Board é responsável por toda interação gráfica, sendo necessário apenas o método
refresh() para a atualização da matriz e impressão da mesma no terminal;
* A atualização com o refresh() será feita com a REFERÊNCIA da matriz enviada por construtor para a Board.


 **Boas práticas**
 - Criar documentação de todas as classes;
 - Comentar o código;

 - Desenvolver o diagrama de classes
  * Por não haver orientação a objeto não haverá indicações entre classes, portanto faça as flechas indicando as funções utilizadas e o por que foram chamadas.
