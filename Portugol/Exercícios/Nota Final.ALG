Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 24/01/2022
Var
// Seção de Declarações das variáveis
    N1, N2, N3, N4: Inteiro
    MD: Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
    Escreval ("Qual foi a nota do primeiro bimestre?")
    Leia(N1)
    Escreval ("Qual foi a nota do segundo bimestre?")
    Leia(N2)
    Escreval ("Qual foi a nota do terceiro bimestre?")
    Leia(N3)
    Escreval ("Qual foi a nota do quarto bimestre?")
    Leia(N4)
    MD<-(N1+N2+N3+N4)/4
    Se (MD >= 9) entao
        Escreval ("A sua nota final foi A")
    Senao
        Se (MD >= 8) entao
            Escreval ("A sua nota final foi B")
        Senao
            Se (MD >= 7) entao
                Escreval ("A sua nota final foi C")
            Senao
                Se (MD >= 6) entao
                    Escreval ("A sua nota final foi D")
                Senao
                    Se (MD >= 5) entao
                        Escreval ("A sua nota final foi E")
                    Senao
                        Escreval ("A sua nota final foi F")
                    FimSe
                FimSe
            FimSe
        FimSe
    FimSe
Fimalgoritmo