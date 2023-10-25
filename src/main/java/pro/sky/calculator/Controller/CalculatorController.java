package pro.sky.calculator.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService culculatorService;

    public CalculatorController(CalculatorService culculatorService) {
        this.culculatorService = culculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer num1,  @RequestParam(name = "num2", required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Введи второе число";
        }
        return culculatorService.plus(num1, num2);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer num1,  @RequestParam(name = "num2", required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Введи второе число";
        }
        return culculatorService.minus(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer num1,  @RequestParam(name = "num2", required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Введи второе число";
        }
        return culculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer num1,  @RequestParam(name = "num2", required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return "Введи второе число";
        }
        if (num2.equals(0)) {
            return "Делить на ноль нельзя";
        }
        return culculatorService.divide(num1, num2);
    }


}
