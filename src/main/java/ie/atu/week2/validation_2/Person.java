package ie.atu.week2.validation_2;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @Min(value = 1, message = "Value must be greater than or equal to 1")
    private Integer employeeID;

    @Min(value = 0, message = "Value must be greater than or equal to 0")
    private Integer age;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;
}
