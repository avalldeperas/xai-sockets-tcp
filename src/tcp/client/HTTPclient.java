/*

* Copyright (c) Joan-Manuel Marques 2013. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This file is part of the practical assignment of Distributed Systems course.
*
* This code is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This code is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this code.  If not, see <http://www.gnu.org/licenses/>.
*/

package tcp.client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import edu.uoc.dpcs.lsim.logger.LoggerManager.Level;
import lsim.library.api.LSimLogger;


/**
 * @author Joan-Manuel Marques
 *
 */

public class HTTPclient {

	public HTTPclient() {
	}
			
	/**
	 * 	1 create client socket, indicate IP and Port of server
		2 Send data to server through the socket pair established.
		3 Read data sent by server, through the established socket pair
		4 repeat 2 & 3 as many times as needed.
		5 Close server connection.
	 */
	public String get(String http_server_address, int http_server_port){
		LSimLogger.log(Level.INFO, "inici HTTPclient.get ");
		LSimLogger.log(Level.INFO, "HTTP server_address: " + http_server_address);
		LSimLogger.log(Level.INFO, "HTTP server_port: " + http_server_port);

		String peticio = ""; 
		//  https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/OPTIONS
	    // https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Accept
		
	   	LSimLogger.log(Level.INFO, peticio);

	   	String resposta = "";
	
		/* TODO: implementació de la part client TCP / implementación de la parte cliente TCP */
		
		return resposta;
	}
}