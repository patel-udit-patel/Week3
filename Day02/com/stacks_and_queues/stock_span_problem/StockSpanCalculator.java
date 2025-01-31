package Day02.com.stacks_and_queues.stock_span_problem;

public class StockSpanCalculator {
    public static void main(String[] args) {
        StockSpan stockSpan=new StockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans =stockSpan.calculateSpan(prices);

        // Print the spans
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}
