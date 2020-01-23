package pl.jakalski.stunt.meetings;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("meetings")
public class MeetingController {
    private final MeetingManager meetingManager;

    public MeetingController() {
        meetingManager = new MeetingManager();
    }

    @PostMapping(produces = "application/json")
    public @ResponseBody Meeting create() {
        Meeting myMeeting = meetingManager.createMeeting();
        return myMeeting;
    }

    @GetMapping (produces = "application/json")
    public @ResponseBody List<Meeting> getAll(){
       return meetingManager.allMeetings();
    }
}
