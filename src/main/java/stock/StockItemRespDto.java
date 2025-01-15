package stock.stocklist.model;

public class StockItemRespDto {
    private int id;
    private String name;
    private int price;
    private String market;
    private String code;
    private int likes;
    public StockItemRespDto() {}
    public StockItemRespDto(int id, String name, int price, String market, int likes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.market = market;
        this.code = code;
        this.likes = likes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id < 0) return;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name==null) return;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if (price < 0) return;
        this.price = price;
    }
    public String getMarket() {
        return market;
    }
    public void setMarket(String market) {
        if (market==null) return;
        this.market = market;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        if (likes < 0) return;
        this.likes = likes;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        if (code==null) return;
        this.code = code;
    }
}
