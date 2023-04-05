package uz.pdp.spring_boot_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class StudentEntity {

    @Id
    private UUID id;
    private String name;
    private String username;
    private int age;
}
