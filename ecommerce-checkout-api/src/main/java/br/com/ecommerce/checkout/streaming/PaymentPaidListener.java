package br.com.ecommerce.checkout.streaming;

import br.com.ecommerce.checkout.entity.CheckoutEntity;
import br.com.ecommerce.common.event.PaymentCreatedEvent;
import br.com.ecommerce.checkout.repository.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@RequiredArgsConstructor
@Slf4j
public class PaymentPaidListener implements Consumer<PaymentCreatedEvent> {

    private final CheckoutRepository checkoutRepository;

    @Override
    public void accept(PaymentCreatedEvent event) {
        final CheckoutEntity checkoutEntity = checkoutRepository.findByCode(event.getCheckoutCode().toString()).orElseThrow();
        checkoutEntity.setStatus(CheckoutEntity.Status.APPROVED);
        checkoutRepository.save(checkoutEntity);
    }
}
