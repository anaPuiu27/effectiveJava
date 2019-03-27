package chapter4_classesAndInterfaces.item20_interfaces.Demo.simulate;

public class SingerWriterImpl extends Writer implements Singer {

    AbstractSingerImpl abstractSingerImpl = new AbstractSingerImpl();

    //interface
    @Override
    public void sing() {
        //sing your song
    }

    //first abstract
    @Override
    public void compose() {
        abstractSingerImpl.compose();
    }

    //second abstract
    @Override
    public void write() {
        super.write();
        //write some more
    }

    private class AbstractSingerImpl extends AbstractSinger{

        // not needed to be implemented; only to get access to AbstractSinger default impl
        @Override
        public void compose() {
            // do compose
        }
    }
}
