
package br.com.fiap.bitsnbytes.challenge_2.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Vehicle {
    private String licensePlate;
    private String brand;
    private String model;
    private int year;
    private String color;
    private String vin;
}
