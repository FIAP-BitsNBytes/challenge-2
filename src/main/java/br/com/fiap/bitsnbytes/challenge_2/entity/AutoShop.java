
package br.com.fiap.bitsnbytes.challenge_2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AutoShop {
    private UUID id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private java.time.LocalDateTime createdAt;
    private java.time.LocalDateTime updatedAt;
}
