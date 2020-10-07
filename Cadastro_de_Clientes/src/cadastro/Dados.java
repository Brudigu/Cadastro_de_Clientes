package cadastro;

public class Dados {
    private String nomeUser, cpfUser, senhaUser, ruaUser, cidadeUser, estadoUser;
    
    public static void main(String[] args) {
        UIinicio menu = new UIinicio();
        menu.setVisible(true);
    }
    
    String getNome(){
        return nomeUser;
    }
    
    void setNome(String nome){
        nomeUser = nome;
    }
    
    String getSenha(){
        return senhaUser;
    }
    
    void setSenha(String senha){
        senhaUser = senha;
    }
    
    String getCPF(){
        return cpfUser;
    }
    
    void setCPF(String cpf){
        cpfUser = cpf;
    }
    
    String getCidade(){
        return cidadeUser;
    }
    
    void setCidade(String cidade){
        cidadeUser = cidade;
    }
    
    String getEstado(){
        return estadoUser;
    }
    
    void setEstado(String estado){
        estadoUser = estado;
    }
    
    String getRua(){
        return ruaUser;
    }
    
    void setRua(String rua){
        ruaUser = rua;
    }
}
