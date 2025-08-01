
package br.com.fiap.bitsnbytes.challenge_2.entities;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class BasePerson {
    private UUID id;
    private String name;
    private String email;
    private String phone;
}
