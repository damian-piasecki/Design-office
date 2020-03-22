package pl.my.programisci.eduapp.model.http;

import java.io.Serializable;

public class AuthenticationResponse  implements Serializable {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
