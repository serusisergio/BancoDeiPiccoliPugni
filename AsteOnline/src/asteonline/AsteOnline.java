/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteonline;

/**
 *
 * @author BancoDeiPiccoliPugni
 */
public class AsteOnline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Moneta moneta = new Moneta(new Float(1.0));
        OggettoMateriale oggettoMateriale = new OggettoMateriale(new Float(20.0), "Carretto", "Questo oggetto è una carretta", Category.Vehicles);

        System.out.println("Valore moneta: " + moneta.valore);

        System.out.println("\nNome: " + oggettoMateriale.nome);
        System.out.println("Valore: " + oggettoMateriale.valore);
        System.out.println("Descrizione: " + oggettoMateriale.descrizione);
        System.out.println("Categoria: " + oggettoMateriale.category);
    }

}
