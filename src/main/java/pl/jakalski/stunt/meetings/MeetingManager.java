package pl.jakalski.stunt.meetings;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class MeetingManager {
    private Object LocalDateTime;

    public int Meeting(String identifier) {
        List<MeetingList> meetingList;
        String name;
        String place;
        LocalDateTime date;

        public void AddMeeting (String name, LocalDateTime date, String place){
            MeetingList newMeeting = new MeetingList(String name, LocalDateTime date, String place);
            meetingList.add(newMeeting);
        }
        public int MeetingsNumber() {

            int number = meetingList.size();

            return number;
        }
        public List FindMeeting( String name) {

            for (MeetingList MeetingList : newMeeting) {
                if (name==newMeeting.name) {
                    Pozycja szukanaPozycja = lista.get(i);

                    break;
                }
                i++;
            }
            return total;
    }
}