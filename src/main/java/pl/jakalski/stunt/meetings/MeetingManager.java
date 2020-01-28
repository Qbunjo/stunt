package pl.jakalski.stunt.meetings;

import java.util.*;

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
    public List<Meeting> allMeetings (){
        Collection<Meeting> collection = allMeetings.values();
        ArrayList<Meeting> arrayList = new ArrayList<>(collection);
        return arrayList;
    }
   // Meeting findAllMine(String owner){return allMeetings}
}
