/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.test;

import algoZoo.game.*;
import java.util.ArrayList;

/**
 *
 * @author esra, Kerem
 */
public class TestModeModel extends AlgoZooModel{
    //properties
    
    //constructors
    public TestModeModel(Animal animal, int startX, int startY, int finishX, int finishY) {
       super(animal, startX, startY, finishX, finishY);
    }
    
    //methods
    @Override
    public void initNewGame() {
      super.initNewGame();
    }
    @Override
   public void addMovementPattern(char c) {
      
      getMovementPattern().add(c);
   }
    
}
