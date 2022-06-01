Algoritmo "Super Contador"

Var
// Seção de Declarações das variáveis
C, O: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

Escreval ("           ---------------------")
Escreval ("           |        Menu       |")
Escreval ("           ---------------------")
Escreval ("           |  [1] De 1 a 10    |")
Escreval ("           |  [2] De 10 a 1    |")
Escreval ("           |  [3] Sair         |")
Escreval ("           ---------------------")
Leia (O)
C<- 0
Se (O = 1) ou (O = 2) ou (O = 3) entao
    Escolha O
        Caso 1
            Repita
                C<- C + 1
                Escreva (C)
            Ate C > 9
        Caso 2
        C<- 10
            Repita
                Escreva (C)
                C<- C - 1
            Ate C < 1
        Caso 3
            Escreval ("Obrigado por participar!")
    FimEscolha
Senao
     Escreval ("Erro: digite um número de 1 até 3")
Fimse
Fimalgoritmo