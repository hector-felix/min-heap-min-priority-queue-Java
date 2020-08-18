/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minheapal;

/**
 *
 * @author Hector Felix
 */
interface MinPriorityQueue<T> {

    public void insert(String cat);

    public String minimum();

    public String extractMin();

    public String isEmpty();
    
}
