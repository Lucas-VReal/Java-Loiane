Algoritmo "Detector de Gordo"

Var
// Seção de Declarações das variáveis
N, Pesado: caractere
P, Mai: Real
I: Inteiro
Procedimento Topo()
Inicio
LimpaTela
EscrevaL ("-------------------------------------------------")
EscrevaL ("         D E T E C T O R D E P E S A D O         ")
EscrevaL ("         Maior peso até agora: ", Mai, " Kg      ")
EscrevaL ("-------------------------------------------------")
FimProcedimento
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
Topo()
I<-0
Para I<-1 ate 5 faca
    Escreva ("Digite o nome: ")
    Leia(N)
    Escreva ("Digite o peso de ", N, ": ")
    Leia(P)
    Se (P>Mai) entao
        Mai<- P
        Pesado<- N
    FimSe
LimpaTela
Topo ()
EscrevaL ("A pessoa mais pesada foi: ", Pesado, ", com ", Mai, " quilos")
EscrevaL ("")
FimPara
LimpaTela
Topo ()
EscrevaL ("A pessoa mais pesada foi: ", Pesado, ", com ", Mai, " quilos")

Fimalgoritmo