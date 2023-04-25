package entity;


import java.util.Date;

import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(value = "OrderDetails")
@Component
public class Order {

  @Id
  private int id;
  private Payment paymentDetails;
  private Product product;
  private Date orderDate;
  @Size(min = 1)
  private int quantity;
  private String description;
}
