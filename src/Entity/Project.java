package Entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Project {
    private Long id;
    private String name;
    private String description;
    private Date creationTime;
    private Date lastModifiedTime;
}
