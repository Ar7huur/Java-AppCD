
package appcd;

//RA: 262012782JOSÉ RENATO CUNHA ROYER 
//RA: 262012855 - ARTHUR SILVA MARQUES FIGUEIRINHA



public class AppCd {

   
    public static void main(String[] args) {
        Cd cd1, cd2, cd3;
        Musica m1,m2,m3;
        Acervo ac1,ac2;
  
        //cd
        cd1= new Cd("Sertanejo","opa","Ze-Rico",2000);
        cd2 = new Cd("Pop","pocpoc","Dunha",2021);
        cd3 = new Cd("Rock","As melhores","AcDC",1901);
        
        //musica
        m1= new Musica("Zezinho",5);
        m2 = new Musica("Eguinha",2);
        m3= new Musica("Ferrozin",3);
        
        cd1.addMusica(m1);
        cd2.addMusica(m2);
        cd3.addMusica(m3);
        
        //Acervo;
        ac1= new Acervo("JOSÉ RENATO");
        ac1.addCD(cd1);
        ac1.addCD(cd2);
        
        ac2 = new Acervo("ARTHUR SILVA");
        ac2.addCD(cd3);
        
        //busca
        ac1.getCdArtista("opa");
        
        //deletar
        ac1.delCd("opa");
        ac1.delCd("poppoc");
        
        //dando errado kk
        ac1.exibir();
        ac2.exibir();
        
        
        
    }
    
}
