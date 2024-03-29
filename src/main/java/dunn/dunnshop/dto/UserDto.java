package dunn.dunnshop.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserDto {

    private String userId;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String address;


    @Builder
    public UserDto(String userId, String password, String phone, String name, String email, String address) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}