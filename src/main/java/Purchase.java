import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "PurchaseList")
public class Purchase {

    @EmbeddedId
    private PurchaseKey id;

    @Column(name = "student_name",
            insertable = false,
            updatable = false,
            length = 100)
    private String studentName;

    @Column(name = "course_name",
            insertable = false,
            updatable = false,
            length = 100)
    private String courseName;

    private Integer price;

    @Column(name = "subscription_date")
    private Date subscriptionDate;
}
