package portfolio.dto;

import java.time.LocalDate;

//포트폴리오 매도 변경
public class AcquisitionPutReqDTO {
    private int stockId;
    private LocalDate orderAt;
    private int quantity;
    private int price;
    private int portfolioId;

    public AcquisitionPutReqDTO(int stockId, LocalDate orderAt, int quantity, int price, int portfolioId) {
        this.stockId = stockId;
        this.orderAt = orderAt;
        this.quantity = quantity;
        this.price = price;
        this.portfolioId = portfolioId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public LocalDate getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(LocalDate orderAt) {
        this.orderAt = orderAt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
    }
}
