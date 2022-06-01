Algoritmo "Contando de 0 a 10"

Var
// Seção de Declarações das variáveis
C, V, Tot010, IMP, SIMP: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

Para C<-1 ate 6 faca
    Escreva ("Digite um valor: ")
    Leia(V)
    Limpatela
        Se (V >= 0) e (V <= 10) entao
            Tot010<- Tot010 + 1
        FimSe
        Se (V%2 = 1) entao
           IMP<- IMP + 1
           SIMP<- SIMP + V
        FimSe
FimPara
Escreval ("Estão entre 0 e 10:", Tot010, " números, dentre os que foram digitados")
Escreval ("")
Escreval ("E, dentre os números digitados", IMP, " números são ímpares")
Escreval ("")
Escreval ("A soma dos números ímpares digitados é:", SIMP)
Fimalgoritmo