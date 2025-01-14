package stock.dto;

public class StockRespDto {
    boolean isSuccess;

    public StockRespInstanceDto getStock() {
        return stock;
    }

    public void setStock(StockRespInstanceDto stock) {
        this.stock = stock;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    StockRespInstanceDto stock;
}
