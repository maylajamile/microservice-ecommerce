package br.com.ecommerce.payment.streaming;

import br.com.ecommerce.common.event.CheckoutCreatedEvent;
import br.com.ecommerce.common.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.function.Function;

@Component
@RequiredArgsConstructor
@Slf4j
public class CheckoutCreatedListener implements Function<CheckoutCreatedEvent, PaymentCreatedEvent> {

    @Override
    public PaymentCreatedEvent apply(CheckoutCreatedEvent event) {
        log.info("Processando pagamento");

        final PaymentCreatedEvent paymentCreatedEvent = PaymentCreatedEvent.newBuilder()
                .setCheckoutCode(event.getCheckoutCode())
                .setCheckoutStatus(event.getStatus())
                .setPaymentCode(UUID.randomUUID().toString())
                .build();

        log.info("Pagamento processado");

        return paymentCreatedEvent;
    }
}
