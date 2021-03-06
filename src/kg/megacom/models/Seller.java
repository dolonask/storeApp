package kg.megacom.models;

import kg.megacom.services.OperationService;
import kg.megacom.services.SellService;

public class Seller extends Employee implements SellService {

    private Operation[] operations;


    public void print(){

        for (Operation oper:operations
             ) {
            if (oper == null) continue;

            System.out.println(oper.getId());
            System.out.println(oper.getOperationType());
            System.out.println(oper.getOperationStatus());
            for (OperationDetails operDet: oper.getOperationDetails()
                 ) {
                if (operDet == null) continue;

                System.out.println(operDet.getProduct().getName());
                System.out.println(operDet.getProduct().getPrice());
                System.out.println(operDet.getAmount());
            }
        }

    }

    public Seller(int id, String name) {
        super(id, name);
        operations = new Operation[100];
    }

    @Override
    public void sell(Product product) {
        /*

            1. Найти открытую операцию.
            2. Если нет такой, то создать

         */
        Operation myOperation = getOperation();


        // Тут надо вызвать Exception
        if (myOperation == null){
            System.out.println("Массив наполнен!");
            return;
        }

        for (int i = 0; i < myOperation.getOperationDetails().length; i++) {

            OperationDetails operationDetails = myOperation.getOperationDetails()[i];

            if (operationDetails == null) {
                operationDetails = new OperationDetails(product, 1);
                myOperation.getOperationDetails()[i] = operationDetails;
                break;
            }else{
                if (operationDetails.getProduct().getId() == product.getId()){
                    operationDetails.setAmount(operationDetails.getAmount() + 1);
                    break;
                }
            }
        }


    }

    private Operation getOperation() {

        Operation myOperation = null;

        for (int i = 0; i < operations.length; i++){

            if (operations[i] != null) {
                if (operations[i].getOperationStatus().equals(OperationStatus.OPEN)) {
                    myOperation = operations[i];
                    break;
                }else{
                    continue;
                }
            }

            myOperation = new Operation(Math.random(),OperationStatus.OPEN, OperationType.SELL);
            operations[i] = myOperation;
            break;

        }

        return myOperation;
    }

    @Override
    public void closeOperation(OperationStatus operationStatus) {


        /*
            1. Найти операцию со статусов OPEN
            2. Если такой операции нет, то вызвать Exception (Операция не найдена!)
            3. Если операций со статусом OPEN больше чем 1, то вызвать Exception (Системная ошибка!)
            4. Если все ок, то закрываем операцию
         */
    }
}
