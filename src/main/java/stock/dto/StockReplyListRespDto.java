package stock.dto;

import java.util.List;

public class StockReplyListRespDto {
    boolean isSuccess;
    List<StockReplyItemRespDto> replies;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public List<StockReplyItemRespDto> getReplies() {
        return replies;
    }

    public void setReplies(List<StockReplyItemRespDto> replies) {
        this.replies = replies;
    }
}
