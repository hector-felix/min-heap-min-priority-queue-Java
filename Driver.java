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
public class Driver {
    public static void main (String [] args)  {
		System.out.println(parent(0));
		MinPriorityQueue<String> pq = new HeapMinPriorityQueue<String>();
		pq.insert("cat");
		pq.insert("dog");
		pq.insert("bee");
		System.out.println("Smallest is: " + pq.minimum());
		System.out.println("Smallest again: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Is it empty? : " + pq.isEmpty());
		pq.insert("eagle");
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Is it empty? : " + pq.isEmpty());
		System.out.println("Min of empty queue: " + pq.minimum());
		System.out.println("Remove min of empty queue: " + pq.extractMin());
		pq.insert("bear");
		System.out.println("Smallest is: " + pq.minimum());
		System.out.println("Smallest again: " + pq.extractMin());
		pq.insert("cat");
		pq.insert("dog");
		pq.insert("sheep");
		pq.insert("cow");
		pq.insert("eagle");
		pq.insert("bee");
		pq.insert("lion");
		pq.insert("tiger");
		pq.insert("zebra");
		pq.insert("ant");
		System.out.println("Bigger example:");
		System.out.println("Smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
		System.out.println("Next smallest is: " + pq.extractMin());
	}
}
