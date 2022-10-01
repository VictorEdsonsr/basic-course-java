package aula3;

public class VariaveisString {
    public static void main (String[] args){
        //quando declaramos strings usamos aspas duplas
        //quando declaramos char usamos aspas simples
        String nome = "Victor";
        char letra = 'a';

        System.out.println(nome + " " + letra);

        //char pode ser um inteiro se somado com outro
        //isso porque e utilizado a tabela ASCII
        //e sao somados de acordo com seus numeros
        char o = 'o';
        char i = 'i';

        //somados
        System.out.println(o + i);

        //concatenados
        System.out.println("" + o + i);
    }
}
