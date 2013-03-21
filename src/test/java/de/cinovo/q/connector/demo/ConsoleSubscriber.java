// -------------------------------------------------------------------------------
// Copyright (c) 2011-2013 Cinovo AG
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Apache License, Version 2.0
// which accompanies this distribution, and is available at
// http://www.apache.org/licenses/LICENSE-2.0.html
// -------------------------------------------------------------------------------

package de.cinovo.q.connector.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.cinovo.q.connector.KXConnectorAsync;
import de.cinovo.q.connector.KXError;
import de.cinovo.q.connector.KXException;
import de.cinovo.q.connector.KXListener;
import de.cinovo.q.connector.impl.KXConnectorFactory;
import de.cinovo.q.query.Result;

/**
 * Console subscriber.
 * 
 * @author mwittig
 * 
 */
public final class ConsoleSubscriber implements KXListener {
	
	/** KX connector. */
	private final KXConnectorAsync c = KXConnectorFactory.create(this, "localhost", 5010, true);
	
	
	/**
	 * @param args Arguments not needed
	 */
	public static void main(final String[] args) {
		try {
			final ConsoleSubscriber console = new ConsoleSubscriber();
			console.start();
			System.out.println("ConsoleSubscriber: Enter a command...");
			final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			while ((line = in.readLine()) != null) {
				System.out.println("Command: " + line);
				final String[] l = line.split(" ");
				if (l[0].equals("quit")) {
					break;
				} else if (l[0].equals("start")) {
					console.start();
				} else if (l[0].equals("stop")) {
					console.stop();
				} else if (l[0].equals("sub") || l[0].equals("subscribe")) {
					console.subscribe(l[1], l[2]);
				} else {
					System.err.println("Unknown command: " + line);
				}
			}
			in.close();
			console.stop();
			System.out.println("Good bye");
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
	
	/** */
	public ConsoleSubscriber() {
		super();
	}
	
	/**
	 * Start.
	 */
	public void start() {
		try {
			this.c.connect();
		} catch (final KXException e) {
			System.err.println("KXException: " + e);
		} catch (final KXError e) {
			System.err.println("KXError: " + e);
		}
	}
	
	/**
	 * Stop.
	 */
	public void stop() {
		try {
			this.c.disconnect();
		} catch (final KXError e) {
			System.err.println("KXError: " + e);
		}
	}
	
	/**
	 * Subscribe.
	 * 
	 * @param table Table
	 * @param symbol Symbol
	 */
	public void subscribe(final String table, final String symbol) {
		try {
			this.c.subscribe("", new String[] {table}, new String[] {symbol});
		} catch (final KXException e) {
			System.err.println("KXException: " + e);
			e.printStackTrace();
		}
	}
	
	@Override
	public void error(final KXError e) {
		System.out.println(e);
	}
	
	@Override
	public void exception(final KXException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	
	@Override
	public void resultReceived(String handle, Result result) {
		System.out.println(result);
	}
	
}
