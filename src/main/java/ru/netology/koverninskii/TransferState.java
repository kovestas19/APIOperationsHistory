package ru.netology.koverninskii;

public enum TransferState {
    NEW("Черновик создан"),CREATED("Перевод создан"),PROCESSING("Перевод на подтверждении"),
    CANCELED("Перевод отменен"),PROCESSED("Перевод подтвержден");
    public final String status;
    TransferState(String status){
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}
