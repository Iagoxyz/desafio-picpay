package tech.build.picpay.dto;

import java.math.BigDecimal;

public record UserDTO(String firstName,
                      String lastName,
                      String document,
                      BigDecimal balance,
                      String password) {
}
