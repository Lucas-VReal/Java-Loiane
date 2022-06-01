Algoritmo " Notas dos Alunos"

Var
// Seção de Declarações das variáveis
  nome: vetor[1..4] de caractere
  n1: vetor[1..4] de Real
  n2: vetor[1..4] de Real
  m: vetor [1..4]  de Real
  i: Inteiro

  Procedimento index ()
  Inicio
        Escreval ("--------------------------")
        Escreval ("                          ")
        Escreval ("  ALUNOS DA ESCOLA FÁCIL  ")
        Escreval ("                          ")
        Escreval ("--------------------------")
        Escreval("")
        Escreval("")
  FimProcedimento

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

Para i<- 1 ate 4 faca
index()
Escreva("Escreva o nome do", i, "o. Aluno: ")
Leia (nome[i])
Escreval("")
Escreva ("Escreva a Primeira nota: ")
Leia (n1[i])
Escreval("")
Escreva ("Escreva a Segunda nota: ")
Leia (n2[i])
Escreval("")
m[i]<- (n1[i] + n2[i])/2
LimpaTela

FimPara

Limpatela
index()
Escreval ("     Listagem de Alunos:      ")
Escreval("")
Para i<- 1 ate 4 faca
Se (m[i] > 6) entao
     Escreval("O Aluno ", nome[i], " teve a média ", m[i], " e foi aprovado(a)")
     Escreval("")
Senao
     Escreval("O Aluno ", nome[i], " teve a média ", m[i], " e foi reprovado(a)")
     Escreval("")
FimSe

FimPara


Fimalgoritmo