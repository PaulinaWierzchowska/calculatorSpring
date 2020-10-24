package pl.sda.calculator.numbers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController /* tego typu kontroler zwraca jsony*/
@RequestMapping("/api")
public class RestCalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private ResultsCache resultsCache;

    @PostMapping("/calculate")
    public ResultDTO calculate(@RequestBody NumbersDTO numbersDTO){

        String numbers = numbersDTO.getNumbers();
        int result = calculatorService.calculateNumbers(numbers);
        List<String> resultList = resultsCache.addAndShowResults(numbers, result);

        return new ResultDTO(result,resultList);
    }


}
