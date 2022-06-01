Algoritmo "Numero Primo"

Var
// Seção de Declarações das variáveis
C, N, P, Cont: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
Escreva ("Digite um número: ")
Leia (N)
C<- 1
Cont<- 0
    Repita
    Se N % C = 0 entao
    Cont<- Cont + 1
    Fimse
    C<- C + 1
    Ate (C > N)
Se Cont > 2 entao
   Escreval ("Ao todo existem", Cont, " números divisíveis por", N)
   Escreval ("Portando não é um número Primo")
Senao
     Escreval(N, " só é divisível por um número e ele mesmo, portanto é Primo")
Fimse
Fimalgoritmo