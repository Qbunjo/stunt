package pl.jakalski.stunt.meetings;

import java.util.*;

class MeetingManager {

    private Map<Integer, Meeting> allMeetings = new HashMap<>();

    /**
     * To create new meeting.
     *
     * @param owner every meeting needs to have owner specified
     * @return new meeting with unique ID
     */
    Meeting createMeeting(String owner) {
        Meeting meeting = new Meeting();
        allMeetings.put(meeting.getId(), meeting); //add to map
        return meeting;
    }

    Meeting find(Integer id) {
        return allMeetings.get(id);
    }

    public List<Meeting> allMeetings() {
        Collection<Meeting> collection = allMeetings.values();
        ArrayList<Meeting> arrayList = new ArrayList<>(collection);
        return arrayList;
    }
}
