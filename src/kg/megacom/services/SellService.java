package kg.megacom.services;

import kg.megacom.models.OperationStatus;
import kg.megacom.models.Product;

public interface SellService {

    /*

        Создать операцию продажи
        Продавать по одному товару
        Закрыть операцию

     */


    void sell(Product product);

    void closeOperation(OperationStatus operationStatus);
}
