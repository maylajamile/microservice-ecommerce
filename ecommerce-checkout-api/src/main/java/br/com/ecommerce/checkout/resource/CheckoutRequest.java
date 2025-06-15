package br.com.ecommerce.checkout.resource;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable {

    @NotBlank(message = "O primeiro nome é obrigatório")
    private String firstName;

    @NotBlank(message = "O sobrenome é obrigatório")
    private String lastName;

    @NotBlank(message = "O e-mail é obrigatório")
    @Email(message = "E-mail inválido")
    private String email;

    @NotBlank(message = "O endereço é obrigatório")
    private String address;

    private String complement;

    @NotBlank(message = "O país é obrigatório")
    private String country;

    @NotBlank(message = "O estado é obrigatório")
    private String state;

    @NotBlank(message = "O CEP é obrigatório")
    @Pattern(regexp = "\\d{5}-?\\d{3}", message = "CEP deve estar no formato 00000-000")
    private String zip;

    @NotNull(message = "Informe se deseja salvar o endereço")
    private Boolean saveAddress;

    @NotNull(message = "Informe se deseja salvar as informações")
    private Boolean saveInfo;

    @NotBlank(message = "O método de pagamento é obrigatório")
    private String paymentMethod;

    @NotBlank(message = "O nome impresso no cartão é obrigatório")
    private String cardName;

    @NotBlank(message = "O número do cartão é obrigatório")
    @Pattern(regexp = "\\d{16}", message = "Número do cartão deve conter 16 dígitos")
    private String cardNumber;

    @NotBlank(message = "A data de validade do cartão é obrigatória")
    @Pattern(regexp = "(0[1-9]|1[0-2])/\\d{2}", message = "Data de validade deve estar no formato MM/AA")
    private String cardExpiration;

    @NotBlank(message = "O CVV do cartão é obrigatório")
    @Pattern(regexp = "\\d{3}", message = "CVV deve conter 3 dígitos")
    private String cardCvv;
}
