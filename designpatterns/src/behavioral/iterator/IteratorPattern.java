package behavioral.iterator;

public class IteratorPattern {

    public static void main(String[] args) {

        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.HINDI);

        while(baseIterator.hasNext()){
            Channel c = baseIterator.next();
            System.out.println(c.TYPE() + " " + c.frequency());
        }
        System.out.println("*****************");
        baseIterator = channels.iterator(ChannelTypeEnum.ENGLISH);


        while(baseIterator.hasNext()){
            Channel c = baseIterator.next();
            System.out.println(c.TYPE() + " " + c.frequency());
        }


    }


    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }
}
