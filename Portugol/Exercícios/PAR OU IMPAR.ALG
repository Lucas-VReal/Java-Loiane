Algoritmo "Par e Impar"

Var
// Seção de Declarações das variáveis
    N: Inteiro
    R: Caractere

Funcao POI (x: Inteiro): caractere
Inicio
      Se (x%2 = 0) entao
            Retorne "Par"
      Senao
            Retorne "ímpar"
      FimSe
FimFuncao

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
Escreva ("Escreva um número: ")
Leia (N)
R<- POI(N)

Escreval ("O número ", N, " é um número ", R)

Fimalgoritmo