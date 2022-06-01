Algoritmo "Sequência de Fibonachi"

Var
// Seção de Declarações das variáveis
R, N1, N2: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
N1<- 1
N2<- 1
Escreva (N1)
Para R:= 1 ate 13 faca
     Escreva (N1)
     N1<- N1 + N2
     Se N1 > N2 entao
         N2<- N1 - N2
     Fimse
FimPara
Fimalgoritmo
