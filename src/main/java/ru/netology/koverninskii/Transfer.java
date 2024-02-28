package ru.netology.koverninskii;

public class Transfer {
    public static int minAmount = 0;
    public static int maxAmount = 999999;

    protected long transferNum;
    protected TransferState transferState;
    protected double transferFee;
    protected double transferAmount;

    public Transfer(long transferNum, TransferState transferState, double transferFee, double transferAmount){
        this.transferNum = transferNum;
        this.transferState = transferState;
        this.transferFee = transferFee;
        this.transferAmount = transferAmount;
        }
    public long getTransferNum(){
        return transferNum;
    }
    public String getTransferState(){
        return transferState.getStatus();
    }
    public double getTransferFee(){
        return transferFee;
    }
    public double getTransferAmount(){
        return transferAmount;
    }

    }

