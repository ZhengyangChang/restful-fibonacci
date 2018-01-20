package fibonacci;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * The main controller for the service.
 */
@RestController
public class FibonacciController {

    @RequestMapping("/fibonacci")
    public long[] fibonacci(@RequestParam(value = "n", defaultValue = "5") int n) {
        return Fibonacci.fibonacciGenerator(n);
    }

    @ExceptionHandler(InvalidArgumentException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Invalid Argument: n should not be negative or n is too large that cause overflow")
    public void invalidFibonacci() {
    }
}
