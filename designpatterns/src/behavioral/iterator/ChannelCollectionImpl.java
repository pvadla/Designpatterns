package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        this.channelsList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, channelsList);
    }

    private class ChannelIteratorImpl implements ChannelIterator{

        private ChannelTypeEnum type;
        private List<Channel> channelsList;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channelsList) {
            this.type = type;
            this.channelsList = channelsList;

        }

        @Override
        public boolean hasNext() {

            while(position < channelsList.size()){

                Channel c = channelsList.get(position);

                if(c.TYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)){
                    return true;
                }else{
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channelsList.get(position);
            position++;
            return c;
        }
    }
}
