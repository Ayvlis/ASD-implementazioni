import datastr.*;

class DataStructures {
	public static void main(String[] args) {
		
		int[] array = RandomArray.array(20);
		Sort.arrayToString(array);

		System.out.println();
		System.out.println();

		Heap heap = Heap.buildHeap(array);

		System.out.println(heap);

		heap.insert(65);

		System.out.println(heap);


	}
}
