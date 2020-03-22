package pl.my.programisci.eduapp.model.http;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest implements Serializable {
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;

}
