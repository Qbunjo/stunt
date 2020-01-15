  
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
            MeetingList newMeeting = new MeetingList(String, LocalDateTime, String);
            MeetingList.add(newMeeting);
        }
        public int MeetingsNumber() {

            int number = meetingList.size();

            return number;
        }
        public List FindMeeting( Integer number) {

            
                 NewMeeting = lista.get(number);

                               
              
            }
            return NewMeeting;
    }
}
