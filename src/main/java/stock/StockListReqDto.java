package stock.stocklist.model;

public class StockListReqDto {
    private int offset;
    private String text;

    public StockListReqDto() {}
    public StockListReqDto(int offset, String text) {
        this.offset = offset;
        this.text = text;
    }

    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        if (offset < 0) { return; }
        this.offset = offset;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        if (text == null) { return; }
        this.text = text;
    }
}
