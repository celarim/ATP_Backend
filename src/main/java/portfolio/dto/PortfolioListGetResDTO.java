package portfolio.dto;

import java.util.List;

//소유 포트폴리오 조회
public class PortfolioListGetResDTO {
    private List<PortfolioItemGetResDTO> portfolioItems;

    public PortfolioListGetResDTO(List<PortfolioItemGetResDTO> portfolioItems) {
        this.portfolioItems = portfolioItems;
    }

    public List<PortfolioItemGetResDTO> getPortfolioItems() {
        return portfolioItems;
    }

    public void setPortfolioItems(List<PortfolioItemGetResDTO> portfolioItems) {
        this.portfolioItems = portfolioItems;
    }
}
