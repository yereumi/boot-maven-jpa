package kr.co.ureca.s9validation;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ValidRequestDTO {

	@NotBlank
	String name;

	@Email
	String email;

//	@Pattern(regexp = "01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$")
	@Telephone
	String phoneNumber;

	@Min(value = 20, groups = ValidationGroup1.class)
	@Max(value = 40, groups = ValidationGroup1.class)
	int age;

	@Size(min = 0, max = 40)
	String description;

	@Positive(groups = ValidationGroup2.class)
	int count;

	@AssertTrue
	boolean booleanCheck;

} // class
