public class Main{
    public static void main(String[] args) {
        double[] numbers = { 4, 9, 16 }; // Örnek olarak bir dizi tanımladık

        double sumOfReciprocals = 0;
        for (double number : numbers) {
            sumOfReciprocals += 1.0 / number; // Sayıların terslerini topluyoruz
        }

        double harmonicMean = numbers.length / sumOfReciprocals; // Harmonik ortalama formülü

        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }
}
