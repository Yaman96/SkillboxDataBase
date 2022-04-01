

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkedPurchaseListKey implements Serializable {

    @Column(name = "student_id",length = 100)
    private String studentId;

    @Column(name = "course_id",length = 100)
    private String courseId;
}
