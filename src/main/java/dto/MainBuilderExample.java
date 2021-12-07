package dto;

import dto.UserDto.Builder;

public class MainBuilderExample {

    public static void main(String[] args) {
        UserDto.Builder builder = new Builder();
        UserDto userDto = builder.withLastName("S").withAge(23).build();
        System.out.println(userDto);

    }

}
