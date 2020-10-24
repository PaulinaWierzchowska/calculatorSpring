package pl.sda.calculator.numbers;

import java.util.List;

public class ResultDTO {
    private Integer result;
    private List<String> resultList;

    public ResultDTO(Integer result, List<String> resultList) {
        this.result = result;
        this.resultList = resultList;
    }

    public Integer getResult() {
        return result;
    }

    public List<String> getResultList() {
        return resultList;
    }
}
