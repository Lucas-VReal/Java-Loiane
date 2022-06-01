Algoritmo "Valores Pares e Ímpares"

Var
// Seção de Declarações das variáveis
v: vetor[1..7] de inteiro
c, x, Totpar, Totimpar: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
 Totpar<- 0
 Totimpar<- 0

Para c<-1 ate 7 faca
    Escreva ("Digite aqui o", c, "o. valor: ")
    Leia(v[c])
    Se (v[c] % 2 = 0) entao
       Escreval (v[c], " é um número par")
       Totpar<- Totpar + 1
    Senao
       Escreval (v[c], " é um número ímpar")
       Totimpar<- Totimpar + 1
    FimSe
FimPara
LimpaTela
Escreval ("O total de números pares é ", Totpar)
Escreval ("")
Escreval ("O total de números pares é ", Totimpar)
Fimalgoritmo