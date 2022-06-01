Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/01/2022
Var
// Seção de Declarações das variáveis
time1, time2: caractere
gols_time1, gols_time2, goleada: Inteiro


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
    Escreval ("Quem é o time da casa?")
    Leia(time1)
    Escreval ("Quem é o time visitante?")
    Leia(time2)
    Escreval ("Quantos Gols o ", time1," fez?")
    Leia(gols_time1)
    Escreval ("Quantos Gols o ", time2," fez?")
    Leia(gols_time2)
    Escreval ("-----------------------------------")
    Escreval ("  ", time1," ", gols_time1, " X ", gols_time2, " ", time2)
    Escreval ("-----------------------------------")
Se (gols_time1 > gols_time2) entao
    Escreval(time1, " Venceu!")
    goleada<- gols_time1 - gols_time2
Senao
    Se (gols_time1 < gols_time2) entao
        Escreval(time2, " Venceu!")
        goleada<- time2 - time1
    Senao
        Escreval("Houve um empate")
        goleada<- gols_time1 - gols_time2
    FimSe
FimSe
Se (goleada > 5) entao
    Escreval ("A diferença foi de ", goleada, " Gols, e caracteriza uma goleada!")
Senao
    Escreval ("A diferença foi de ", goleada, " Gols, e caracteriza uma partida normal")
FimSe
Fimalgoritmo