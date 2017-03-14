package serialization;

import java.util.ArrayList;
import java.util.List;

public class SerializationApp
{
    public static void main(String[] args)
    {
        // create a list of partipants
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Ben","Dem",17));
        participants.add(new Participant("Mel","Pol",19));
        participants.add(new Participant("Nic","Mez",12));
        participants.add(new Participant("Zak","Web",13));
        
        System.out.println("Participants: " + participants);
        
        // create an instance of Serialization Demo,
        // called 'demo', which calls the method SerializationDemo()
        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "src/Participants.txt");
        
        // give the user feedback when its done
        System.out.println("Serialization Done");
        
        // create a new list of participants
        // call it new list
        // assign it to the newly created list constructed with the deserialized list
        List<Participant> newList = demo.deserialize("src/Participants.txt");
        System.out.println("New list: " + newList);
    }
}