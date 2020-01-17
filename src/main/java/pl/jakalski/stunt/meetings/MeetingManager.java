package pl.jakalski.stunt.meetings;

import java.util.HashMap;
import java.util.Map;

class MeetingManager {
    Map<Integer,Meeting> allMeetings=new HashMap<>();

    Meeting createMeeting() {
        Meeting meeting=new Meeting();
        allMeetings.put(meeting.getId(),meeting); //add to map
        return meeting;
    }

    Meeting find(Integer id) {
        return allMeetings.get(id);
    }
}
