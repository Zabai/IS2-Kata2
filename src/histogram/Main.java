package histogram;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1,1,1,2,3,4,8,5,5,3,2,1,5,6,4,7,8,9,6,2};
        String[] sArray = {"Ana", "Juan", "Pedro", "Ana", "Pedro"};
        
        Histogram<Integer> histogram = HistogramCalculator.histCaculate(array);
        Histogram<String> histogram1 = HistogramCalculator.histCaculate(sArray);
        
        for (Object key : histogram.keySet()) {
            System.out.println("Key: " + key + " -> " + histogram.get(key));
        }
        
        for (Object key : histogram1.keySet()) {
            System.out.println("Key: " + key + " -> " + histogram1.get(key));
        }
    }
}
