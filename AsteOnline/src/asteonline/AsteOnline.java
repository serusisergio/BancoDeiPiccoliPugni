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
        Money money = new Money(new Float(1.0));
        MaterialObject materialObject = new MaterialObject(new Float(20.0), "Carretto", "Questo oggetto è una carretta", Category.Vehicles);

        System.out.println("Valore moneta: " + money.value);

        System.out.println("\nName: " + materialObject.name);
        System.out.println("value: " + materialObject.value);
        System.out.println("Description: " + materialObject.description);
        System.out.println("Category: " + materialObject.category);
    }

}
