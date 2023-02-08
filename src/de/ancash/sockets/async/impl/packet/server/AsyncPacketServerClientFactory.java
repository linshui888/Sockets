package de.ancash.sockets.async.impl.packet.server;

import java.io.IOException;
import java.nio.channels.AsynchronousSocketChannel;

import de.ancash.sockets.async.client.AbstractAsyncClientFactory;
import de.ancash.sockets.async.server.AbstractAsyncServer;

public class AsyncPacketServerClientFactory extends AbstractAsyncClientFactory<AsyncPacketServerClient>{

	@Override
	public AsyncPacketServerClient newInstance(AbstractAsyncServer asyncServer, AsynchronousSocketChannel socket, int queueSize, int readBufSize, int writeBufSize) throws IOException  {
		return new AsyncPacketServerClient(asyncServer, socket, queueSize, readBufSize, writeBufSize);
	}

	@Override
	public AsyncPacketServerClient newInstance(String address, int port, int queueSize, int readBufSize, int writeBufSize, int threads) throws IOException {
		throw new UnsupportedOperationException();
	}
}
