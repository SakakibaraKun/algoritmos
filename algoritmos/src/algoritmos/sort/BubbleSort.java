package algoritmos.sort;

import java.util.ArrayList;

public class BubbleSort {

	public ArrayList<Integer> BubbleSort(ArrayList<Integer> arrayList) {
		ArrayList<Integer> bubble = new ArrayList<>();
		bubble.addAll(arrayList);
		// variav�is
		int a = 0, b = 0;
		boolean sair = false;
		int count = 1;
		while (sair == false) {
			// fazendo a troca de posi��es
			for (int i = bubble.size() - 1; i > 0; i--) {
				sair=false;
				if (bubble.get(i) < bubble.get(i - 1)) {
					a = bubble.get(i);
					b = bubble.get(i - 1);
					bubble.set(i, b);
					bubble.set(i - 1, a);
					count += 1;
				}
				if (i == 1 && count > 1) {
					count = 0;					
				}else 
					if(i==1&&count==0){
					sair=true;
				}				
			}			
		}

		return (bubble);
	}

}