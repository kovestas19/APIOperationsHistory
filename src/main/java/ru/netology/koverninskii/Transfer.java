package ru.netology.koverninskii;

public class Transfer {
    public static int minAmount = 0;
    public static int maxAmount = 999999;

    public long transferNum;
    public TransferState transferState;
    public double transferFee;
    public double transferAmount;

    public Transfer(long transferNum, TransferState transferState, double transferFee, double transferAmount){
        this.transferNum = transferNum;
        this.transferState = transferState;
        this.transferFee = transferFee;
        this.transferAmount = transferAmount;
        }

    }

