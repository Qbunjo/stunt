package pl.jakalski.stunt.meetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingManagerTest {
    private MeetingManager tested;

    @BeforeEach
    void createTestedObject() {
        tested = new MeetingManager();
    }

    @Test
    void shouldCreateMeeting() {
         //when
        Meeting createdMeeting = tested.createMeeting();
        //then
        assertNotNull(createdMeeting);
    }

    @Test
    void shouldFoundMeetingHaveTheSameId() {
        //given
        Meeting createdMeeting = tested.createMeeting();
        //when
        Meeting found = tested.find(createdMeeting.getId());
        //then
        Integer expected = createdMeeting.getId();
        Integer actual = found.getId();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIdBeNotNull() {
        //given

        Meeting createdMeeting = tested.createMeeting();

        //when
        Integer actual = createdMeeting.getId();
        assertNotNull(actual);

    }
   // @Test
    //void shouldGetStringWithUsernameAndReturnsAllMeetings(){
        //given
      //  Meeting createdMeeting = tested.createMeeting();
        //when
      //  String thisUser="user01";


   // };
 //gets string with username and returns all meetings
    //deleting meetings
}