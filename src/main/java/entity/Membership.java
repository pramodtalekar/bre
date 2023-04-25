package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Membership {

    @Id
    private int id;
    private String type;
    private boolean isActive;
    private boolean upgrade;
}
