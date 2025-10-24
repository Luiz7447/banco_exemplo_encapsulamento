/**
 * Classe para instaciar objetos encapsulados da classe conta
 * @author Luiz Felipe de Oliveira
 * @since Classe criada em 17/10/2024
 */
public class Banco {
    public static void main(String [] args){
        Conta cc = new Conta("Gervásio", 1000f, 1234, false);
        cc.menu();
        /*
        cc.exibirDadosConta();
        cc.realizarSaque();
        cc.exibirDadosConta();
        cc.realizarDeposito();
        cc.exibirDadosConta();
        cc.verificarSaldo();
        cc.trocarSenha();
        cc.realizarSaque();
        */
    }//fim do main
}//fim da classe
