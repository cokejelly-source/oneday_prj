package kr.co.oneday.payment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentController {

    public String payment() {
        return "payment/payment";
    }

    @GetMapping("/paymentComplete")
    public String paymentComplete() {
        return "payment/paymentComplete";
    }
}
