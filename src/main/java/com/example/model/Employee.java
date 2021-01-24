package com.example.model;

import com.example.validatior.Email;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document(collection = "employees")
@Data
@NoArgsConstructor
public class Employee {

    @Id
    private String id;

    @NotBlank
    @Size(min = 2, message = "First Name should have atleast 2 characters")
    private String firstName;

    @NotBlank
    @Size(min = 2, message = "Last Name should have atleast 2 characters")
    private String lastName;

    @NotBlank
    @Email
    private String emailAddress;

    @NotBlank
    @Size(min = 2, message = "Passport should have atleast 2 characters")
    private String passportNumber;

    @NotBlank
    private String birthDay;

}
