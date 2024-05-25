package Entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Issue {
    private Long id;
    private String title;
    private String description;
    private String status;
    private Long projectId;
    private String reporterId;
    private String assigneeId;
    private String fixerId;
    private Date reportedTime;
    private Date lastModifiedTime;
}
