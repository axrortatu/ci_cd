package uz.pdp.spring_boot_api.entity;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
//@Entity
public class StudentEntity {

//    @Id
    private UUID id;
    private String name;
    private String username;
    private int age;
}
