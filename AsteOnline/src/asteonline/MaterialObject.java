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
public class MaterialObject extends Asset {

    Category category;
    String name;
    String description;

    public MaterialObject(float value, String name, String description, Category category) {
        this.value = value;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public Category getCategoria() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
