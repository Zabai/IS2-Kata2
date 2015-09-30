package histogram;

public class HistogramCalculator {
    public static <T> Histogram<T> histCaculate(T[] array){
        Histogram<T> histo = new Histogram<>();
        for (T key : array) {
            histo.increase(key);
        }
        return histo;
    }
}
