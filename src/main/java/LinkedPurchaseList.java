import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name = "LinkedPurchaseList")
public class LinkedPurchaseList {

    @EmbeddedId
    private LinkedPurchaseListKey id;

    @Column(name = "student_id",updatable = false,insertable = false, length = 100)
    private String studentId;

    @Column(name = "course_id", updatable = false, insertable = false, length = 100)
    private String courseId;

}
