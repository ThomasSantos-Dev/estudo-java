public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      
        
        // TiposEVariaveis.java

        double salarioMinimo = 2500.00; // forma correta de representar um numero acima de mil


        // voce precisa colocar um short em uma variavel com tipo maior onde voce quer armazenar pra garantir que nao vai ter perda.
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

                /*
                 * esta linha é considerada como declaração de variável iniciamos a existência
                 * variavel numero com valor 5 regra: tipo + nome + valor
                 */
                int numero = 5;
        
                /*
                 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
                 * não é mais necessário, pois a variável já foi declarada anteriormente
                 */
                numero = 10;
        
                System.out.print(numero);
                
                /*
                 * ao usar a palavra reservada final, você determina que jamais
                 * esta variavel poderá obter outro valor;
                 * logo a linha 25 vai apresentar um erro de compilação
                 * isso é considerado uma CONSTANTE na linguagem Java
                 */
                final double VALOR_DE_PI = 3.14;
                
              // VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
            
        
    }
}
