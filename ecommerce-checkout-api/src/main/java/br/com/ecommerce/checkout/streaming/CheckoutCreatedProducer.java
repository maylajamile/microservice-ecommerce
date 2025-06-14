package br.com.ecommerce.checkout.streaming;

import br.com.ecommerce.checkout.event.CheckoutCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CheckoutCreatedProducer {

    private static final String CHECKOUT_CREATED_OUTPUT = "checkoutCreated-out-0";

    private final StreamBridge streamBridge;

    public void send(CheckoutCreatedEvent event) {
        streamBridge.send(CHECKOUT_CREATED_OUTPUT, event);
    }
}
