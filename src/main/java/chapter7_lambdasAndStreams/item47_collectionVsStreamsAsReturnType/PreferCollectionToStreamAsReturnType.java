package chapter7_lambdasAndStreams.item47_collectionVsStreamsAsReturnType;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class PreferCollectionToStreamAsReturnType {

    public static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }

    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
    
    public static void main(String[] args) {


        for (ProcessHandle p : iterableOf(ProcessHandle.allProcesses())) { // Process the process
            //do something
        }
    }
}
