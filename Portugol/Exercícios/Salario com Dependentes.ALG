Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/01/2022
Var
// Seção de Declarações das variáveis
    Name: caractere
    S, NS: Real
    D: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
    Escreval ("Qual é o nome do funcionário? ")
    Leia(Name)
    Escreval ("Qual é o salário do funcionário? ")
    Leia (S)
    Escreval ("Quantos dependentes têm o funcionário? ")
    Leia (D)

    Escolha D
        Caso 0
        NS<- S
        Caso 1, 2, 3
        NS<- S + (S * 10/100)
        Caso 4, 5, 6
        NS<- S + (S * 15/100)
        OutroCaso
        NS<- S + (S * 20/100)
    FimEscolha
    Escreval ("Você possui: ", D, " Dependentes")
    Escreval ("Portanto receberá o salário de R$ ", NS:5:2)
Fimalgoritmo