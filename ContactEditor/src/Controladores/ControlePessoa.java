/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Corretor;
import Entidades.Pessoa;
import Entidades.Vendedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControlePessoa {
    private ArrayList<Pessoa> listaPessoas = new ArrayList();
    private final String arquivo = "Pessoas.dat";
    

    public ControlePessoa() throws Exception{   
        recuperaPessoas();
        
    }
    
    public void addVendedor(String nome, String cpf, String email, String fone, String cont){
        listaPessoas.add(new Vendedor(nome, cpf, email, fone, cont));
    }
    
    public void addCorretor(String nome, String cpf, String email, String fone, double corretagem, String creci){
        listaPessoas.add(new Corretor(nome, cpf, email, fone, creci, corretagem));
    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
    
    public void gravaPessoas() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream(arquivo);
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaPessoas);
        objOS.flush();
        objOS.close();
    }

    public void recuperaPessoas() throws Exception {
        File objFile = new File(arquivo);
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream(arquivo);
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaPessoas = (ArrayList<Pessoa>) objIS.readObject();
            objIS.close();
        }
    }
    
    
}
