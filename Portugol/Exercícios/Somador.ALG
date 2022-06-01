Algoritmo "Somador"

Var
// Seção de Declarações das variáveis
X, Y, A, B: Inteiro
R: Caractere
Procedimento Calculadora ()
Inicio
EscrevaL ("-----------------------------------")
EscrevaL ("|                                 |")
EscrevaL ("|        |Calculadora|            |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
Escreva ("|    :")
Leia (x)
LimpaTela
EscrevaL ("-----------------------------------")
EscrevaL ("|                                 |")
EscrevaL ("|        |Calculadora|            |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
EscrevaL ("|    :",x:3,"                         |")
Escreva ("|    :")
Leia (y)
LimpaTela
EscrevaL ("-----------------------------------")
EscrevaL ("|                                 |")
EscrevaL ("|        |Calculadora|            |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
EscrevaL ("|    :",x:3,"                        |")
EscrevaL ("|    :",y:3,"                       |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
EscrevaL ("|  Resultado:                     |")
EscrevaL ("|                                 |")
EscrevaL ("-----------------------------------")
FimProcedimento

Procedimento Calculadora_I ()
Inicio
EscrevaL ("-----------------------------------")
EscrevaL ("|                                 |")
EscrevaL ("|        |Calculadora|            |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
x<- x + y
Escreval ("|    : ", x:3,"                      |")
LimpaTela
EscrevaL ("-----------------------------------")
EscrevaL ("|                                 |")
EscrevaL ("|        |Calculadora|            |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
EscrevaL ("|    :",x:3,"                         |")
Escreva ("|    :")
Leia (y)
LimpaTela
EscrevaL ("-----------------------------------")
EscrevaL ("|                                 |")
EscrevaL ("|        |Calculadora|            |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
EscrevaL ("|    :",x:3,"                        |")
EscrevaL ("|    :",y:3,"                        |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
EscrevaL ("|  Resultado:                     |")
EscrevaL ("|                                 |")
EscrevaL ("-----------------------------------")
FimProcedimento

Procedimento soma(A, B: Inteiro)
Inicio
LimpaTela
EscrevaL ("-----------------------------------")
EscrevaL ("|                                 |")
EscrevaL ("|        |Calculadora|            |")
EscrevaL ("|                                 |")
EscrevaL ("|    ",A:3,"                          |")
EscrevaL ("|      +                          |")
EscrevaL ("|    ",B:3,"                          |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
EscrevaL ("|                                 |")
EscrevaL ("|  Resultado:",A+B:3,"                  |")
EscrevaL ("|                                 |")
EscrevaL ("-----------------------------------")
FimProcedimento
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
x<-0
y<- 0
      Calculadora ()
      soma(x, y)
Repita
Escreval ("Deseja Continuar? [S/N]")
Leia (R)
LimpaTela
         Se (R = "S") entao
            Calculadora_I ()
            soma (x,y)
         FimSe
ate R = "N"
soma(x, y)
Escreval("Obrigado por participar!")
Fimalgoritmo