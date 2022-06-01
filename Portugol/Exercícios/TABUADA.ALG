Algoritmo "Tabuada"

Var
// Seção de Declarações das variáveis
    numero, X, tabuada: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
    Escreval("-------------------------")
    Escreval("        TABUADA          ")
    Escreval("-------------------------")
Escreva ("Você quer a tabuada de qual número? ")
Leia(numero)
X<- 0
    Repita
        X<- X + 1
        tabuada<- (numero * X)
        Escreval(numero, " x ", X, " = ", tabuada)
    Ate X > 9


Fimalgoritmo