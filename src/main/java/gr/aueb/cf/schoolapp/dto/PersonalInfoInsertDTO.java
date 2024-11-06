package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonalInfoInsertDTO {

    @Pattern(regexp = "^\\d{11}$", message = "AMKA must be an 11-digit string.")
    private String amka;

    @NotEmpty(message = "Identity must not be empty.")
    private String identityNumber;

    @NotEmpty(message = "Place of birth must not be empty.")
    private String placeOfBirth;

    @NotEmpty(message = "Municipality must not be empty.")
    private String municipalityOfRegistration;
}
