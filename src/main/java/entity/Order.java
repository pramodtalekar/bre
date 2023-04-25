package entity;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(value = "OrderDetails")

public class Order {

  @Id
  private int id;
  private Date orderDate;
  private int quantity;
  private String description;
}
