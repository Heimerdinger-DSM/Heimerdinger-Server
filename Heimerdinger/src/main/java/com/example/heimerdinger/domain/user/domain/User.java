package com.example.heimerdinger.domain.user.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID userPk;

    @NotNull
    @Column(columnDefinition = "VARCHAR(20)")
    private String userId;

    @NotNull
    @Column(columnDefinition = "VARCHAR(20)")
    private String userPassword;
    
    @NotNull
    @Column(columnDefinition = "VARCHAR(20)")
    private String userName;

    @Builder
    public User(String userId, String userPassword, String userName) {
        this.userId = userId;
        this.userPassword = userName;
    }

}
