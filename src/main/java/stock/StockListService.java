package stock.stocklist.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import common.DbConnection;
import stock.stocklist.model.StockItemRespDto;
import stock.stocklist.model.StockListReqDto;
import stock.stocklist.model.StockListRespDto;
import stock.stocklist.model.dao.StockListDao;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class StockListService {
    private StockListDao listdao;
    public StockListService() {
        this.listdao = new StockListDao(DbConnection.getConnection());
    }
    public StockListRespDto getStockList(StockListReqDto reqDto) {
        ArrayList<StockItemRespDto> items = listdao.getItems(reqDto.getOffset(), reqDto.getText());

        // TODO: 크롤링 서버에 HTTP Request로 Price 받아오기

        try {
            /*
            HttpClient client = HttpClient.newHttpClient();
            for (StockItemRespDto item : items) {
                HttpRequest httpRequest = HttpRequest.newBuilder()
                        .uri(URI.create("http://atp.libertygame.work:8000/stock"))
                        .header("Content-type", "application/json" )
                        .GET()
                        .build();
                HttpResponse httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                String responseBody = httpResponse.body().toString();

                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode rootNode = objectMapper.readTree(responseBody);
                JsonNode checkSuccess = rootNode.get("success");
                if (!checkSuccess.asBoolean()) {
                    String reason = rootNode.get("reason").asText();
                    throw new Exception(reason);
                }
                JsonNode resultNode = rootNode.get("result");
                ArrayList<String> result = objectMapper.readValue(resultNode.toString(), ArrayList.class);
            }

         */
            // 크롤링 구간 끝
            StockListRespDto dto = new StockListRespDto();
            dto.setSuccess(true);
            dto.setStocks(items);
            return dto;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            StockListRespDto dto = new StockListRespDto();
            dto.setSuccess(false);
            dto.setStocks(null);
            return dto;
        }



    }
}
