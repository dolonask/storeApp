package kg.megacom;

import kg.megacom.models.Product;
import kg.megacom.models.Seller;

public class Main {

    public static void main(String[] args) {


        Seller seller = new Seller(1, "Dolon");



        seller.sell(new Product(1, "Молоко", 100));
        seller.sell(new Product(1, "Молоко", 100));
        seller.sell(new Product(1, "Молоко", 100));
        seller.sell(new Product(1, "Молоко", 100));
        seller.sell(new Product(1, "Молоко", 100));
        seller.sell(new Product(1, "Молоко", 100));
        seller.sell(new Product(1, "Молоко", 100));
        seller.sell(new Product(2, "СЫР", 1000));
        seller.sell(new Product(2, "СЫР", 1000));
        seller.sell(new Product(2, "СЫР", 1000));
        seller.sell(new Product(2, "СЫР", 1000));
        seller.sell(new Product(2, "СЫР", 1000));

        seller.print();
    }
}
