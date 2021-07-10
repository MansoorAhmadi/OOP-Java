package fr.epita.datamodel;

public class StockOrder {
    private int quantity;
    private double unitPrice;
    private double commission;

    public StockOrder(int quantity, double unitPrice, double commission){
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.commission = commission;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getCommission(){
        return commission;
    }

    public void setCommission(double commission){
        this.commission = commission;
    }

    Stock stock;                    //aggregation
    InvestmentAccount account;      //aggregation
}
