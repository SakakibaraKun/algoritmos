package algoritmos;

import java.util.ArrayList;

import algoritmos.sort.BubbleSort;
import algoritmos.sort.SelectionSort;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> minhalista = new ArrayList<>();
		minhalista.add(10); 
		minhalista.add(3); 
		minhalista.add(5); 
		minhalista.add(2); 
		minhalista.add(9); 
		minhalista.add(1); 
		minhalista.add(1); 
		minhalista.add(7); 
		System.out.println("Sua lista foi criada automaticamente!");
		System.out.println("Qual metodo de organização ira usar?");
		
		BubbleSort bs = new BubbleSort();
		SelectionSort ss = new SelectionSort();
		
		//System.out.println(bs.BubbleSort(minhalista));
		System.out.println(ss.selectionSort(minhalista));
		
	}

}
