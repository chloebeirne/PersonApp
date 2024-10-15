package ie.atu.personapp;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotBlank(message = "This value cannot be blank")
    private String name;
    @Min(value=1, message="Value must be greater than 1")
    private int code;
}
