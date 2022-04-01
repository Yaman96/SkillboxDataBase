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
public class PurchaseKey implements Serializable {

    @Column(name = "student_name", length = 100)
    private String studentName;

    @Column(name = "course_name", length = 100)
    private String courseName;
}
