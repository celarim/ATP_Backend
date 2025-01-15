package stock.stocklist.model;

import java.util.ArrayList;

public class StockListRespDto {
    private boolean success;
    private ArrayList<StockItemRespDto> stocks;
    public StockListRespDto() {}
    public StockListRespDto(boolean isSuccess, ArrayList<StockItemRespDto> stocks) {
        this.success = isSuccess;
        this.stocks = stocks;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public ArrayList<StockItemRespDto> getStocks() {
        return stocks;
    }
    public void setStocks(ArrayList<StockItemRespDto> stocks) {
        if (stocks == null) return;
        this.stocks = stocks;
    }
}
