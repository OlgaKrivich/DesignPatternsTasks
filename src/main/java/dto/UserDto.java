package dto;

public class UserDto {

   private String firstName;
   private String lastName;
   private int age;

    public UserDto(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private int age;

        public Builder withName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public UserDto build() {
            return new UserDto(firstName,lastName,age);

        }
    }
}
