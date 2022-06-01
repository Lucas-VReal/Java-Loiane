Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/01/2022
Var
// Seção de Declarações das variáveis
D, Valor: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
   Escreval ("--------------------------------")
   Escreval ("   CRIANÇA ESPERANÇA 2022       ")
   Escreval ("--------------------------------")

   Escreval ("[1] Para doar R$ 10,00")
   Escreval ("[2] Para doar R$ 25,00")
   Escreval ("[3] Para doar R$ 50,00")
   Escreval ("[4] Para doar R$ 100,00")
   Escreval ("[5] Para doar Outros Valores")
   Escreval ("[6] Para cancelar doação")
   Leia (D)

Escolha D
    Caso 1
        Valor<- 10
    Caso 2
        Valor<- 25
    Caso 3
        Valor<- 50
    Caso 4
        Valor<- 100
    Caso 5
        Escreval ("Qual é o valor que deseja doar?")
        Leia (Valor)
    Caso 6
        Valor <- 0
FimEscolha
Escreval ("--------------------------------")
Escreval ("Você está doando R$ ", Valor:4:2)
Escreval ("       Muito Obrigado!          ")
Escreval ("--------------------------------")
Fimalgoritmo