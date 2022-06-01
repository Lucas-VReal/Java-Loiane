/*
Operadores Aritméticos

+             adição (e mais unário)
-             subtração (e menos unário)
*             multiplicação
/             divisão
%             módulo (resto da divisão)
++            incremento (pós ou pré fix)
--            decremento (pós ou pré fix)

Operadores Relacionais

==            igual a
!=            diferente de
>             maior que
<             menor que
>=            maior ou igual que
<=            menor ou igual que

Operadores Lógicos

&             and
|             OR
^             XOR
||            OR curto circuito (ou...ou) falso se vv ou ff
&&            And curto circuito
!             Not

Operadores de Assignment

Precedência

 */

package Aulas.Aula13;

public class Operadores {
    public static void main(String[] args) {

        System.out.println("  String Concatenada:  ");
        System.out.println("");
        String primeiroNome = "Essa é ";
        String segundoNome = "uma string concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);


    }
}
