package stock.stocklist.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import stock.stocklist.model.StockListReqDto;
import stock.stocklist.model.StockListRespDto;
import stock.stocklist.service.StockListService;
import utils.JsonParser;

import java.io.IOException;
import java.util.Map;

@WebServlet("/stocklist/*")
public class StockListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo().substring(1);
        if (action.equals("/view")) {
            StockListReqDto reqDto = new StockListReqDto();
            Map<String, String> reqBody = JsonParser.parse(request, Map.class);
            String offsetString = reqBody.get("offset");
            if (offsetString == null || offsetString.equals("")) {
                reqDto.setOffset(0);
            } else {
                reqDto.setOffset(Integer.parseInt(offsetString));
            }
            String text = reqBody.get("text");
            if (text == null || text.equals("")) {
                reqDto.setText("");
            } else {
                reqDto.setText(text);
            }
            StockListService stockListService = new StockListService();
            StockListRespDto respDto = stockListService.getStockList(reqDto);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(respDto);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
        }
    }
}
