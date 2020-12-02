package pk.cuiatd.dp.sess2.sol;

public class Demo {

	public static void main(String[] args) {
		//Bubble sort
		SortingStrategy strategy = new BubbleSort();
		Context context = new Context(strategy);
		char[] arr1 =  {'z', 'x', 'p', 'v', 'a', 'x', 'b'};
		context.sort(arr1);
		System.out.println("Using Bubble Sort");
		printArray(arr1);

		//Heap Sort
		strategy = new HeapSort();
		context.setStrategy(strategy);
		char[] arr2 =  {'a', 'c', 'p', 'v', 'a', 'z', 'a'};
		context.sort(arr2);
		System.out.println("Using Bubble Sort");
		printArray(arr2);

		//Insertion Sort
		strategy = new InsertionSort();
		context.setStrategy(strategy);
		char[] arr3 =  {'q', 'w', 'e', 'r', 't', 'y', 'u'};
		context.sort(arr3);
		System.out.println("Using Insertion Sort");
		printArray(arr3);

		//Merge Sort
		strategy = new MergeSort();
		context.setStrategy(strategy);
		char[] arr4 =  {'y', 'u', 'i', 'o', 'p', 'a', 's'};
		context.sort(arr4);
		System.out.println("Using Merge Sort");
		printArray(arr4);

		//Quick Sort
		strategy = new QuickSort();
		context.setStrategy(strategy);
		char[] arr5 =  {'d', 'f', 'g', 'h', 'j', 'k', 'l'};
		context.sort(arr5);
		System.out.println("Using Quick Sort");
		printArray(arr5);

		//Selection Sort
		strategy = new SelectionSort();
		context.setStrategy(strategy);
		char[] arr6 =  {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
		context.sort(arr6);
		System.out.println("Using Quick Sort");
		printArray(arr6);

	}
	/* Prints the array */
	static void printArray(char arr[]) { 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	}
}
