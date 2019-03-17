package chapter2_creatingAndDestroyingObjects.item8_finalizersAndCleaners;

import chapter2_creatingAndDestroyingObjects.item8_finalizersAndCleaners.cleaners.Room;

public class AvoidFinalizersAndCleaners {

    public static void main(String[] args) {

        //never do anything time-critical in a finalizer or cleaner
        //never depend on a finalizer or cleaner to update persistent state

        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        }

        Room myRoom = new Room(7);

        for (int i = 1; i <= 1000; i++) {
            // do nothing
        }

        //finalize never called
        //cleaning called only once
    }
}
