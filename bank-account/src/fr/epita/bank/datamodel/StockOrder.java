package fr.epita.bank.datamodel;

public class StockOrder {
    int quantity;
    double unitPrice;
    double commission;

    //this is the aggregation part. StockOrder has Stock.
    //means stock is aggregated from StockOrder, we define it like below
    Stock stock;
    InvestmentAccount investmentAccount;

    public StockOrder(int quantity, double unitPrice, double commission) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.commission = commission;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
