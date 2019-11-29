package Controladores;

import Limites.*;

public class ControlePrincipal {
    
    private ControleImovel objCtrImovel;
    private ControlePessoa objCtrPessoa;
    private ControleProposta objCtrProposta;
    private ControleVisita objCtrVisita;
    private LimitePrincipal objLimPrincipal;

    public ControlePrincipal() {
        objLimPrincipal = new LimitePrincipal(this);
        
        try{
        objCtrPessoa = new ControlePessoa();
        objCtrImovel = new ControleImovel();
        objCtrProposta = new ControleProposta();
        objCtrVisita = new ControleVisita();
        }
        
        catch(Exception e){
            System.out.println("erro na abertura de arquivo");
        }

    }
    
    public void salvaSessao() throws Exception{
        objCtrPessoa.gravaPessoas();
        objCtrImovel.gravaImovel();
    }
    
    public void saida(){
        new LimiteSaida(this);
    }
    
    public void cadVendedor(){
        new LimiteCadVendedor(objCtrPessoa);
    }
    
    public void cadImovel(){
        new LimiteCadImovel(objCtrImovel, objCtrPessoa.getListaPessoas());
    }
    
    public void showPessoas(){
        new LimiteShowPessoas(objCtrPessoa);
    }
    
    public void cadCorretor(){
        new LimiteCadCorretor(objCtrPessoa);
    }
    
    public void showImoveis(){
        new LimiteShowImoveis(objCtrImovel);
    }
    
}
