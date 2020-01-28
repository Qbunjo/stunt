package pl.jakalski.stunt.meetings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MeetingManagerTest {

    private static final String TEST_OWNER = "user01";

    private MeetingManager tested;

    @BeforeEach
    void createTestedObject() {
        tested = new MeetingManager();
    }

    @Test
    void shouldCreateMeeting() {
        //when
        Meeting createdMeeting = tested.createMeeting(TEST_OWNER);
        //then
        assertNotNull(createdMeeting);
    }

    @Test
    void shouldFoundMeetingHaveTheSameId() {
        //given
        Meeting createdMeeting = tested.createMeeting(TEST_OWNER);
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
        Meeting createdMeeting = tested.createMeeting(TEST_OWNER);
        //when
        Integer actual = createdMeeting.getId();
        assertNotNull(actual);
    }

    @Test
    void shouldInitializeOwnerForNewlyCreatedMeeting() {
        //given
        Meeting createdMeeting = tested.createMeeting(TEST_OWNER);
        //when
        String owner = createdMeeting.getOwner();
        //then
        assertEquals("user01", owner);
    }

    @Test
    void shouldReturnOwnerForFoundMeeting() {
        //given
        Meeting createdMeeting = tested.createMeeting(TEST_OWNER);
        //when
        Meeting found = tested.find(createdMeeting.getId());
        //then
        assertEquals(createdMeeting.getOwner(), found.getOwner());
    }
}