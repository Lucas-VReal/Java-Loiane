Algoritmo "Maior nota da Escola"

Var
// Seção de Declarações das variáveis
    alunos, turma: Inteiro
    nota, maior: Real
    nome, melhor: caractere
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
Escreval ("    Escola Santa Paciência      ")
Escreval ("----------------------------------")
Escreva  ("Quantos alunos essa escola têm? ")
Leia (alunos)
Escreval ("----------------------------------")
turma <- 0
maior<- 0
melhor<- ""
    Enquanto turma < alunos faca
    turma<- turma + 1
    Escreval ("Aluno ", turma)
    Escreva("Nome do Aluno: ")
    Leia(nome)
    Escreva("Nota do(a) ", nome, ": ")
    Leia (nota)
    Escreval("---------------")
    Se nota > maior entao
        maior<- nota
        melhor<- nome
    Fimse
    FimEnquanto
Escreval("A maior nota da turma foi do(a) ", melhor, " que tirou:", maior)

Fimalgoritmo