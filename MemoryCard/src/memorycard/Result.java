/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorycard;

/**
 *
 * @author Joco
 */
public class Result {
    private String name;
    private int points;
    
    Result(){
    }
    
    Result(String name, int points){
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    
    
    
    
}
