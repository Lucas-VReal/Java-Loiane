algoritmo "Real em Dolar"
var
reais, dolar, C: Real
rp: Inteiro
inicio
C <- 0
Escreva("Quantas conversões deseja realizar?")
Leia(rp)
Enquanto C < rp faca
         EscrevaL("Quantos reais vcê têm?")
         Leia(reais)
         dolar<- reais / 5.45
         EscrevaL("Você têm U$: ", dolar:3:2, " dolares")
         C<- C + 1
FimEnquanto
// Seção de Comandos
fimalgoritmo
