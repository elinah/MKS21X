public class Sorts{
    static void selection(int[] data){
	int[] retAr = int[data.size()];
	for(int cur=0;cur<data.size();cur++){
	    int min = 0;
	    for(int i=1;i<data.size();i++){
		if (data[i] < data[min])
		    min = i;
	    }
	    retAr.set(0,data[min]);
	    data.remove(min);
	}
    }
}