
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
public class ServiceOrder {
    private UUID id;
    private Vehicle vehicle;
    private Mechanic mechanic;
    private String status;
    private String description;
    private java.time.LocalDateTime createdAt;
    private java.time.LocalDateTime updatedAt;
}
