package portfolio.dto;

//포트폴리오 1개 요소
public class PortfolioItemGetResDTO {
    private int portfolioIdx;
    private String portfolioName;
    private String portfolioCreatedAt;
    private String portfolioUpdatedAt;
    private int badgeCount;

    public PortfolioItemGetResDTO(int portfolioIdx, String portfolioName, String portfolioCreatedAt, String portfolioUpdatedAt, int badgeCount) {
        this.portfolioIdx = portfolioIdx;
        this.portfolioName = portfolioName;
        this.portfolioCreatedAt = portfolioCreatedAt;
        this.portfolioUpdatedAt = portfolioUpdatedAt;
        this.badgeCount = badgeCount;
    }

    public int getPortfolioIdx() {
        return portfolioIdx;
    }

    public void setPortfolioIdx(int portfolioIdx) {
        this.portfolioIdx = portfolioIdx;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getPortfolioCreatedAt() {
        return portfolioCreatedAt;
    }

    public void setPortfolioCreatedAt(String portfolioCreatedAt) {
        this.portfolioCreatedAt = portfolioCreatedAt;
    }

    public String getPortfolioUpdatedAt() {
        return portfolioUpdatedAt;
    }

    public void setPortfolioUpdatedAt(String portfolioUpdatedAt) {
        this.portfolioUpdatedAt = portfolioUpdatedAt;
    }

    public int getBadgeCount() {
        return badgeCount;
    }

    public void setBadgeCount(int badgeCount) {
        this.badgeCount = badgeCount;
    }
}
