package br.com.ecommerce.checkout.streaming;

import br.com.ecommerce.common.event.CheckoutCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class CheckoutCreatedStreamBrigde {

    private static final String CHECKOUT_CREATED_OUTPUT = "checkoutCreated-out-0";

    private final StreamBridge streamBridge;

    public void send(CheckoutCreatedEvent event) {
        log.info("Mensagem enviada");
        streamBridge.send(CHECKOUT_CREATED_OUTPUT, event);
    }
}
