algoritmo "Empréstimo"

var
     valor_do_emprestimo, parcelas, valor_a_pagar: Real
inicio
// Seção de Comandos
    Escreva ("De quanto você precisa?")
    Leia(valor_do_emprestimo)
    valor_a_pagar<- (valor_do_emprestimo * 20)/ 100 + valor_do_emprestimo
    Escreva ("Você pretende pagar em 3, 6, 12 ou 24 vezes?")
    Leia (parcelas)
    Se (parcelas = 3) ou (parcelas = 6) ou (parcelas = 12) ou (parcelas = 24) Entao
    valor_a_pagar <- valor_a_pagar/parcelas
    Escreva("Você vai pagar em ", parcelas, " parcelas, no valor de R$", valor_a_pagar)
    Senao
    Escreva ("O valor de parcelas deve ser 3, 6, 12 ou 24")
    Fimse
fimalgoritmo
