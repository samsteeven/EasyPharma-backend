package com.app.easypharma_backend.domain.payment.dto;

import com.app.easypharma_backend.domain.payment.entity.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequestDTO {
    private UUID orderId; // Deprecated, use orderIds
    private java.util.List<UUID> orderIds;
    private PaymentMethod method; // MTN_MOMO, ORANGE_MONEY
    private String phoneNumber;
}
