
package br.com.fiap.bitsnbytes.challenge_2.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Mechanic extends BasePerson {
    private String mechanicId;
    private String expertise;
    private String phoneNumber;
    private String email;
}
