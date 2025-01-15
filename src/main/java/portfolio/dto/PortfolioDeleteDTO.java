package portfolio.dto;

// 포트폴리오 삭제
public class PortfolioDeleteDTO {
    private int portfolioIdx;

    public PortfolioDeleteDTO(int portfolioIdx) {
        this.portfolioIdx = portfolioIdx;
    }

    public int getPortfolioIdx() {
        return portfolioIdx;
    }

    public void setPortfolioIdx(int portfolioIdx) {
        this.portfolioIdx = portfolioIdx;
    }
}
