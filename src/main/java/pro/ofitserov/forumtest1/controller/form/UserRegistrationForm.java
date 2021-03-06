package pro.ofitserov.forumtest1.controller.form;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import pro.ofitserov.forumtest1.util.ForumConstants;

import javax.validation.constraints.Size;

public class UserRegistrationForm {

    @NotEmpty
    @Size(min = ForumConstants.USERNAME_LENGTH_MIN, max = ForumConstants.USERNAME_LENGTH_MAX)
    @Getter
    @Setter
    private String username;

    @NotEmpty
    @Email
    @Getter
    @Setter
    private String email;

    @NotEmpty
    @Size(min = ForumConstants.PASSWORD_LENGTH_MIN, max = ForumConstants.PASSWORD_LENGTH_MAX)
    @Getter
    @Setter
    private String password;

    @NotEmpty
    @Size(min = ForumConstants.PASSWORD_LENGTH_MIN, max = ForumConstants.PASSWORD_LENGTH_MAX)
    @Getter
    @Setter
    private String confirmPassword;
}