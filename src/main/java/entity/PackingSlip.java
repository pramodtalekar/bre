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
public class PackingSlip {
    @Id
    private int id;
    private String recipient;
    private String address;
    private int paymentRef;
}
