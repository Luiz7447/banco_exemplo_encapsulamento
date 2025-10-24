import javax.swing.JOptionPane;

/**
 * Classe para demonstrar o princípio do Encapsulamento
 * @author Luiz Felipe de Oliveira
 * @since Classe criada em 17/10/2024
 */
public class Conta {
    String cliente;
    private float saldo;
    private int senha;
    private boolean bloqueado;
    int tentativas = 3;
    
    //Construtor da classe
    public Conta (String cliente, float saldo, int senha, boolean bloqueado) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueado = bloqueado;
    }
    
    public void exibirDadosConta(){
        System.out.println("Nome do Cliente: " + cliente);
        System.out.println("Saldo do Cliente: " + saldo);
        System.out.println("Conta Bloqueado: " + (isBloqueado() == true?"Sim":"Não"));
    }
    
    //Método de menu para realizar as operações da conta
    public void menu(){
        int opc = 0;
        System.out.println("Digite a opção que deseja realizar");
        while(opc != 5){
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Saque \n 2 - Deposito \n 3 - Verificar Saldo \n 4 - Trocar Senha \n 5 - Sair"));
        switch(opc){
            case 1:
                realizarSaque();
                break;
            case 2:
                realizarDeposito();
                break;
            case 3:
                verificarSaldo();
                break;
            case 4:
                trocarSenha();
                break;
            case 5:
                System.exit(0);
            }
        }
    }
    
    //Método para realizar um saque na conta do cliente
    private void realizarSaque(){
       int pwd = 0;
       pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
       
       if(!verificarSenha(pwd)){
           JOptionPane.showMessageDialog(null,"Senha inválida!");
           if(!isBloqueado())
               realizarSaque();
       }
       else{
           float vlrSaque = 0;
           vlrSaque = Float.parseFloat(JOptionPane.showInputDialog("valor a sacar"));
           
           if(getSaldo() < vlrSaque)
               JOptionPane.showMessageDialog(null,"Saldo insuficiente");
           else
               setSaldo(getSaldo()-vlrSaque);
       }
    }
    
    //Método para realizar um deposito na conta do cliente
    private void realizarDeposito(){
        int pwd = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha"));
        
        if(!verificarSenha(pwd)){
           JOptionPane.showMessageDialog(null,"Senha inválida!");
           if(!isBloqueado())
               realizarDeposito();
       }
       else{
           float vlrDeposito = 0;
           vlrDeposito = Float.parseFloat(JOptionPane.showInputDialog("valor a depositar"));
           
           if(0 > vlrDeposito)
               JOptionPane.showMessageDialog(null,"Valor inválido");
           else
               setSaldo(getSaldo()+vlrDeposito);
       }
    }
    
    //Método para verificar saldo na conta do cliente
    private void verificarSaldo(){
        int pwd = 0;
        float saldo = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha"));
        
        if(!verificarSenha(pwd)){
           JOptionPane.showMessageDialog(null,"Senha inválida!");
           if(!isBloqueado())
               verificarSaldo();
       }
       else{
           saldo = getSaldo();
           System.out.println("Saldo da conta: " + saldo);
       }
    }
    
    //Método para trocar a senha
    private void trocarSenha(){
        int pwd, novaPwd, confirmarNovaPwd, i;
        pwd = novaPwd = confirmarNovaPwd = i = 0;
        pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha"));
        
        if(!verificarSenha(pwd)){
           JOptionPane.showMessageDialog(null,"Senha inválida!");
           if(!isBloqueado())
               trocarSenha();
       }
       else{
           novaPwd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova senha: "));
           confirmarNovaPwd = Integer.parseInt(JOptionPane.showInputDialog(null, "Repita a nova senha: "));
           
           while(i == 1){
                if(novaPwd == confirmarNovaPwd){
                    setSenha(novaPwd);
                    i++;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Senha inválida!");
                }
           }
       }
    }
    
    //Método para verificar a senha
    private boolean verificarSenha(int pwd){
        if(pwd == getSenha())
            return true;
        else{
            if(tentativas < 1){
                JOptionPane.showMessageDialog(null, "Conta bloqueada!!");
                setBloqueado(true);
            }
            else{
                tentativas--;
                System.out.println("Tentativas: " + tentativas);
            }
            return false;
        }
    }
    
    //Métodos acessor
    private void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    private String getCliente(){
        return this.cliente;
    }
    
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    private float getSaldo(){
        return this.saldo;
    }
    
    private void setSenha(int senha){
        this.senha = senha;
    }
    
    private int getSenha(){
        return this.senha;
    }
          
    private boolean isBloqueado(){
        return bloqueado;
    }        
    
    private void setBloqueado(boolean bloqueado){
        this.bloqueado = bloqueado;
    }
}//fim da classe
