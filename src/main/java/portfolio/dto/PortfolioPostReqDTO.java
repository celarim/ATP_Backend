package portfolio.dto;

//포트폴리오 생성 Request-Body
public class PortfolioPostReqDTO {
    String name;    //포트폴리오 이름
    boolean is_public;

    public PortfolioPostReqDTO(String name, boolean is_public) {
        this.name = name;
        this.is_public = is_public;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_public() {
        return is_public;
    }

    public void setIs_public(boolean is_public) {
        this.is_public = is_public;
    }
}
