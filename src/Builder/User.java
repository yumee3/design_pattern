package Builder;

/**
 * User class built using the Builder pattern.
 *
 * Purpose :
 * Create a User object with required fields
 * while allowing optional attributes to be added flexibly.
 */
public class User {

    // Required fields
    private String email;
    private String username;

    // Optional fields
    private int age;
    private String role;
    private String phone;

    // Private constructor used by the Builder
    private User(Builder builder)
    {
        email = builder.email;
        username = builder.username;
        age = builder.age;
        role = builder.role;
        phone = builder.phone;
    }

    /**
     * Factory method to create a Builder.
     * REQUIRED fields are passed here.
     */
    public static Builder newBuilder(String email, String username)
    {
        return new Builder(email, username);
    }

    public static class Builder
    {

        // Required
        private String email;
        private String username;

        // Optional
        private int age;
        private String role;
        private String phone;

        /**
         * Builder constructor.
         * Add required attributes here.
         */
        private Builder(String email, String username)
        {
            this.email = email;
            this.username = username;
        }

        // Optional setters (fluent API)
        public Builder setAge(int age)
        {
            this.age = age;
            return this;
        }

        public Builder setRole(String role)
        {
            this.role = role;
            return this;
        }

        public Builder setPhone(String phone)
        {
            this.phone = phone;
            return this;
        }

        /**
         * Builds the final User object.
         * Validation of required fields can be done here.
         */
        public User build()
        {
            if (email == null || username == null)
            {
                return null; // Or throw an exception
            }
            return new User(this);
        }
    }
}
