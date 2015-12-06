package se.cag.labs.leaderboard;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import se.cag.labs.usermanager.User;

@Data
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResult {
    @Id
    @Setter(AccessLevel.PRIVATE) private String id;
    private long created = System.currentTimeMillis();
    private User user;
    private long time;
    private long middleTime;
    private ResultType result;
}
