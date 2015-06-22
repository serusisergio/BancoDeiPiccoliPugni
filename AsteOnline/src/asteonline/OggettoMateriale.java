/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

/**
 *
 * @author sergio
 */
public class OggettoMateriale extends Bene{
    String categoria;
    String nome;
    String descrizione;
    
    public OggettoMateriale(float valore,String nome,String descrizione,String categoria){
        this.valore=valore;
        this.nome=nome;
        this.descrizione=descrizione;
        this.categoria=categoria;
    }
}
