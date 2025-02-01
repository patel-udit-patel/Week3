package com.sort_product_prices;

public class SortProductPrices {
    public static void main(String[] args) {
        QuickSort sortProductPrices=new QuickSort();

        int []productPrices=new int[]{1,2,5,4,6,5,7,8,7,9};

        System.out.println("Product prices before sorting :");
        for(int i=0;i<productPrices.length;i++){
            System.out.print(productPrices[i]+" ");
        }
        System.out.println();
        sortProductPrices.quickSort(productPrices,0,productPrices.length-1);

        System.out.println("Product prices after sorting :");
        for(int i=0;i<productPrices.length;i++){
            System.out.print(productPrices[i]+" ");
        }
    }
}
