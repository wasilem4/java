/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Ice
 */
public class SportsmanStrategySwimCraul implements SportsmanStrategySwim {

    @Override
    public String swim() {
        return "Crauling";
    }

    @Override
    public String toString() {
        return "Craul";
    }
    
    
}
