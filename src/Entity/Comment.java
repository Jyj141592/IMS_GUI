package Entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Comment {
    private Long id;
    private Long issueId;
    private String content;
    private String userId;
    private Date creationTime;
}
