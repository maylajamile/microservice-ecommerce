package br.com.ecommerce.checkout.service;

import br.com.ecommerce.checkout.entity.CheckoutEntity;
import br.com.ecommerce.checkout.event.CheckoutCreatedEvent;
import br.com.ecommerce.checkout.repository.CheckoutRepository;
import br.com.ecommerce.checkout.resource.CheckoutRequest;
import br.com.ecommerce.checkout.streaming.CheckoutCreatedProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedProducer checkoutCreatedProducer;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();

        final CheckoutEntity entitySaved = checkoutRepository.save(checkoutEntity);

        final CheckoutCreatedEvent event = CheckoutCreatedEvent.newBuilder()
                .setCheckoutCode(entitySaved.getCode())
                .setStatus(entitySaved.getStatus().name())
                .build();

        checkoutCreatedProducer.send(event);

        return Optional.of(entitySaved);
    }

}