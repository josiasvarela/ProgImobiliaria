package Controladores;

import Entidades.Imovel;
import Entidades.Pessoa;
import Entidades.Vendedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

public class ControleImovel {

    private ArrayList<Imovel> listaImovel = new ArrayList();
    private final String arquivo = "Imoveis.dat";

    public ControleImovel() throws Exception {
        recuperaImovel();
    }

    public void addImovel(int codigo, String tipo, String descricao, String foto, double preco, double comissao, Calendar dataInclusao, Vendedor vendedor) {
        listaImovel.add(new Imovel(codigo, tipo, descricao, foto, preco, comissao, dataInclusao, vendedor));
    }
    
     public void gravaImovel() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream(arquivo);
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaImovel);
        objOS.flush();
        objOS.close();
    }

    public void recuperaImovel() throws Exception {
        File objFile = new File(arquivo);
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream(arquivo);
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaImovel = (ArrayList<Imovel>) objIS.readObject();
            objIS.close();
        }
    }

    public ArrayList<Imovel> getListaImovel() {
        return listaImovel;
    }
    
    

}
