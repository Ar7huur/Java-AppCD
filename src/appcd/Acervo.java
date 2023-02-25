package appcd;

import java.util.ArrayList;
import java.util.List;

public class Acervo {

    private String proprietario;
//    private Cd[] listcd;;;;;;
//    private int TL = 0;
    private ArrayList<Cd> listcd;

    public Acervo(String proprietario) {
        this.proprietario = proprietario;
        listcd = new ArrayList();
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void addCD(Cd cd) {
        listcd.add(cd);
    }

    //busca
    public Cd getCdArtista(String titulo) {
        for (int i = 0; i < listcd.size(); i++) {
            Cd p = listcd.get(i);
            if (p.getTitulo().equals(titulo)) {
                System.out.println(p.getTitulo()+" Encontrado!");
                return p;
            }
            else{
                System.out.println(p.getTitulo()+" Não encontrado!");
            }
        }
        return null;
    }

    public boolean delCd(String titulo) {
        boolean flag = false;
        for (int i = 0; i < listcd.size(); i++) {
            Cd p = listcd.get(i);
            if (p.getTitulo().equals(titulo)) {
                listcd.remove(p);
                flag = true;
                System.out.println("Removido com Sucesso");
            }
            else{
                System.out.println("Não encontrado!");
            }
        }
        return flag;
    }

    
    public void exibir() {
        System.out.println("\n");
        System.out.println("Acervo{" + "proprietario: " + proprietario + ", listcd: " + listcd + '}');
        System.out.println("--------------------------------------------");
    }
    

}
