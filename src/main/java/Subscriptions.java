import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Subscriptions implements Serializable {

    @EmbeddedId
    private SubscriptionsKey id;

    @ManyToOne
    @JoinColumn(name = "student_id",
            insertable = false,
            updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id",
            insertable = false,
            updatable = false)
    private Course course;

    @Column(name = "subscription_date")
    private Date subscriptionDate;
}
