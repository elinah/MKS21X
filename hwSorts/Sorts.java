import java.util.Arrays;

public class Sorts{
    public static void selectionSort(int[] data){;
	int atCur;
	for(int cur=0;cur<data.length-1;cur++){
	    int min = cur;
	    for(int i=cur+1;i<data.length;i++){
		if (data[i] < data[min])
		    min = i;
	    }
	    atCur = data[cur];
	    data[cur] = data[min];
	    data[min] = atCur;
	    System.out.println(Arrays.toString(data));
	}
    }

    public static void insertionSort(int[] data){
	int currentIndex = 1;
	int i;
	int intAtCurrent;
	int changeIndex;
	while (currentIndex < data.length){
	    i = currentIndex - 1;
	    intAtCurrent = data[currentIndex];
	    while (i != 0 && data[currentIndex] < data[i])
		i--;
	    if(data[currentIndex] > data[i]){
		changeIndex = currentIndex -1;
		while (changeIndex > i){
		    data[changeIndex+1] = data[changeIndex];
		    changeIndex--;
		}
		data[i+1] = intAtCurrent;
	    }
	    else if(data[currentIndex] < data[i]){
		changeIndex = currentIndex -1;
		while (changeIndex >= 0){
		    data[changeIndex+1] = data[changeIndex];
		    changeIndex--;
		}
		data[i] = intAtCurrent;
	    }
	    currentIndex++;
	    System.out.println(Arrays.toString(data));
	}
    }

    public static void bubbleSort(int[] data){
	int atCur;
	for(int cur=data.length-1;cur>0;cur--){
	    for(int i=0;i<data.length-1;i++){
		if (data[i] > data[i+1]){
		    atCur = data[i];
		    data[i] = data[i+1];
		    data[i+1] = atCur;
		}
	    }
	    System.out.println(Arrays.toString(data));
	}
    }

    public static void main(String[] args){
	int[] test1 = {1 , 2,  9, 5, 0, 3};
	selectionSort(test1);
	int[] test2 = {1 , 2,  9, 5, 0, 3};
	insertionSort(test2);
	int[] test3 = {1 , 2,  9, 5, 0, 3};
	bubbleSort(test3);
    }
}
