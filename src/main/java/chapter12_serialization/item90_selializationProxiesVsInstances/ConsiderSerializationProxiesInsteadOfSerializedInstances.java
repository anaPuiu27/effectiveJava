package chapter12_serialization.item90_selializationProxiesVsInstances;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public class ConsiderSerializationProxiesInsteadOfSerializedInstances {

    //serialization proxy pattern

    //design a private static nested class that concisely represents the logical state of an instance of the enclosing class

    private final Date start;
    private final Date end;

    public ConsiderSerializationProxiesInsteadOfSerializedInstances(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    private static class SerializationProxy implements Serializable {

        private static final long serialVersionUID = 234098243823485285L;

        private final Date start;
        private final Date end;

        SerializationProxy(ConsiderSerializationProxiesInsteadOfSerializedInstances p) {
            this.start = p.start;
            this.end = p.end;
        }

        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Proxy required");
        }
    }

}
