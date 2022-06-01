Algoritmo "Alan_Vagaba"
// Autor(a): Mundo
Var
// Seção de Declarações das variáveis
ta_nada, mentiu, duvido: Inteiro
job, estudos: Caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
ta_nada<- 0
mentiu <- 0
Enquanto ta_nada < 1 faca
    Escreval("Alan está trabalhando?")
    Leia(job)
   Se (job = "Sim") ou (job = "sim")ou (job = "S") ou (job = "s") ou (job = "yes") ou (job = "y") entao
        Escreval ("Mentira, Segundo a Bíblia você pode responder novamente 70x7!")
        mentiu<- mentiu + 1
        Se (mentiu > 70*7) entao
            Escreval ("Não há evidências da sua eleição")
        FimSe
    Senao
        Escreval ("Você está certo!")
        Escreval ("Você mentiu: ", mentiu, " vezes")
        Se mentiu < 0 entao
            Escreval ("Vejo Cristo em você!")
        Senao
            Escreval ("Arrependa-se dos seus pecados")
            ta_nada<- ta_nada + 1
        FimSe
    FimSe
FimEnquanto
duvido <- 0
Enquanto duvido < 1 faca
    Escreval("Alan está estudando?")
    Leia(estudos)
Se (estudos = "Sim") ou (estudos = "sim") ou (estudos= "S") ou (estudos= "s") ou (estudos= "yes") ou (estudos= "y") entao
        Escreval ("Mentira, Segundo a Bíblia você pode responder novamente 70x7!")
        mentiu<- mentiu + 1
        Se (mentiu > 70*7) entao
            Escreval ("Não há evidências da sua eleição")
        FimSe
Senao
    Escreval ("Você está certo!")
    Escreval ("Você mentiu: ", mentiu, " vezes")
    Se mentiu < 0 entao
        Escreval ("Vejo Cristo em você!")
    Senao
        Escreval ("Arrependa-se dos seus pecados")
        duvido<- duvido + 1
    FimSe
FimSe
FimEnquanto
Escreval ("Envia pro Alan no Zap: Vai estudar Safado!")
Fimalgoritmo