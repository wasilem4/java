/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Focus time
 */
public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }
    
    
    
    @Override protected String path() {
        return super.path() + "/Mammal";
    }
    
    
}
