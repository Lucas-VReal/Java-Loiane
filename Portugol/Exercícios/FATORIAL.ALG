Algoritmo "Fatorial"

Var
// Seção de Declarações das variáveis
    C, F, N: Inteiro
    R: caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
Repita
   Escreva ("Qual número você deseja fatorar? ")
   Leia (N)
   C<- N
   F<- 1
       Repita
           F<- F*C
           C<- C  - 1
       Ate (C < 1)
   Escreval("O fatorial de ", N, " é igual a ", F)
   Escreval("Quer continuar? [S/N]")
   Leia (R)
   Limpatela
Ate(R = "N")
Fimalgoritmo