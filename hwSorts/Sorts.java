public class Sorts{
    public static void selection(int[] data){;
	int atCur;
	for(int cur=0;cur<data.length;cur++){
	    int min = cur;
	    for(int i=cur+1;i<data.length;i++){
		if (data[i] < data[min])
		    min = i;
	    }
	    atCur = data[cur];
	    data[cur] = data[min];
	    data[min] = atCur;
	}
    }
}
