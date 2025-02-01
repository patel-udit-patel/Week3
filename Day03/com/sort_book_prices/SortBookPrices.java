package com.sort_book_prices;

public class SortBookPrices {
    public static void main(String[] args) {
        MergeSort bookPrice=new MergeSort();

        int []bookPrices=new int[]{5, 4, 6, 3, 2, 6, 7, 8, 2};

        System.out.println("Book prices before sorting :");
        for(int i=0;i<bookPrices.length;i++){
            System.out.print(bookPrices[i]+" ");
        }
        System.out.println();
        bookPrice.mergeSort(bookPrices,0,bookPrices.length-1);

        System.out.println("Book prices after sorting :");
        for(int i=0;i<bookPrices.length;i++){
            System.out.print(bookPrices[i]+" ");
        }
    }
}
