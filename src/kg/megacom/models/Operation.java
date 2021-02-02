package kg.megacom.models;

public class Operation {

    private double id;
    private OperationDetails[] operationDetails;
    private OperationStatus operationStatus;
    private OperationType operationType;

    public Operation(double id, OperationStatus operationStatus, OperationType operationType) {
        this.id = id;
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        operationDetails = new OperationDetails[100];
    }

    public Operation(double id, OperationDetails[] operationDetails, OperationStatus operationStatus, OperationType operationType) {
        this.id = id;
        this.operationDetails = operationDetails;
        this.operationStatus = operationStatus;
        this.operationType = operationType;
        operationDetails = new OperationDetails[100];
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OperationDetails[] getOperationDetails() {
        return operationDetails;
    }

    public void setOperationDetails(OperationDetails operationDetail) {
        for (int i = 0; i < this.operationDetails.length; i++){
            if (this.operationDetails[i] == null){
                this.operationDetails[i] = operationDetail;
            }
        }
    }

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

}
